/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sendInformation;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.NameValuePair;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

/**
 *
 * @author Pablo
 */
public class SMS {

    public static int telefono;
    public static String password;

    public static void envioSMS() {

        // Se fija el tiempo máximo de espera para conectar con el servidor (4000)
        // Se fija el tiempo máximo de espera de la respuesta del servidor (50000)
        RequestConfig config = RequestConfig.custom().setConnectTimeout(4000).setSocketTimeout(50000).build();

        // Se inicia el objeto HTTP
        HttpClientBuilder builder = HttpClientBuilder.create();
        builder.setDefaultRequestConfig(config);
        CloseableHttpClient httpClient = builder.build();

        // URL post sobre la que se va a ejecutar la petición
        HttpPost post = new HttpPost("http://www.altiria.net/api/http");

        // Lista de parámetros a enviar en la petición POST
        List<NameValuePair> parametersList = new ArrayList<NameValuePair>();
        
        // identificacion en el sistema Altiria
        parametersList.add(new BasicNameValuePair("cmd", "sendsms"));
        parametersList.add(new BasicNameValuePair("domainId", "demopr"));
        parametersList.add(new BasicNameValuePair("login", "pdelatorree"));
        parametersList.add(new BasicNameValuePair("passwd", "fhcsphdq"));
        parametersList.add(new BasicNameValuePair("dest", "34" + telefono));//

        parametersList.add(new BasicNameValuePair("msg", "BUS-VIGO LA CONTRASEÑA DE SU CUENTA ES: " + password));

        try {
            // Codificacion de caracteres de la peticion POST
            post.setEntity(new UrlEncodedFormEntity(parametersList, "UTF-8"));
        } catch (UnsupportedEncodingException uex) {
            System.out.println("ERROR: codificación de caracteres no soportada");
        }

        CloseableHttpResponse response = null;

        try {
            System.out.println("Enviando petición");
            //Se envía la petición
            response = httpClient.execute(post);
            //Se consigue la respuesta
            String resp = EntityUtils.toString(response.getEntity());

            //Error en la respuesta del servidor
            if (response.getStatusLine().getStatusCode() != 200) {
                System.out.println("ERROR: Código de error HTTP: " + response.getStatusLine().getStatusCode());
                System.out.println("Compruebe que ha configurado correctamente la direccion/url ");
                System.out.println("suministrada por Altiria");
                return;
            } else //Se procesa la respuesta capturada en la cadena 'response'
            if (resp.startsWith("ERROR")) {
                System.out.println(resp);
                System.out.println("Código de error de Altiria. Compruebe las especificaciones");
            } else {
                System.out.println(resp);
            }
        } catch (Exception e) {
            System.out.println("Excepción");
            e.printStackTrace();
            return;
        } finally {
            //En cualquier caso se cierra la conexión
            post.releaseConnection();
            if (response != null) {
                try {
                    response.close();
                } catch (IOException ioe) {
                    System.out.println("ERROR cerrando recursos");
                }
            }
        }
    }
}
