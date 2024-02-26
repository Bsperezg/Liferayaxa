package com.liferay.axa.prueba.constants;

import com.liferay.axa.prueba.Liferay;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.client.Entity;

public class LiferayServices {
    private static final String SERVICE_URL = "https://8e7c6b8a-fc46-4674-a529-4ebec57295d3.mock.pstmn.io/customers";

    public static Response getCustomers() {
        Client client = ClientBuilder.newClient();
        return client.target(SERVICE_URL)
                     .request(MediaType.APPLICATION_JSON)
                     .get();
    }

    public static Response addCustomer(Liferay liferay) {
        Client client = ClientBuilder.newClient();
        return client.target(SERVICE_URL)
                     .request(MediaType.APPLICATION_JSON)
                     .post(Entity.json(liferay));
    }
}
