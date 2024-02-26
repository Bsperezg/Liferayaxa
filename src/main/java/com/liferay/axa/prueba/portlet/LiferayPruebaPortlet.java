package com.liferay.axa.prueba.portlet;

import javax.portlet.*;

import com.liferay.axa.prueba.Liferay;
import com.liferay.axa.prueba.constants.LiferayServices;
import javax.ws.rs.core.Response;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class LiferayPruebaPortlet extends GenericPortlet {
    @Override
    protected void doView(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException, IOException {
        PortletRequestDispatcher dispatcher = getPortletContext().getRequestDispatcher("/META-INF/resources/view.jsp");
        dispatcher.include(renderRequest, renderResponse);
    }

    @Override
    public void processAction(ActionRequest actionRequest, ActionResponse actionResponse) throws PortletException, IOException {
        // Obtener los parámetros enviados desde el formulario
        Map<String, String[]> parameters = actionRequest.getParameterMap();
        String name = parameters.get("name")[0];
        int age = Integer.parseInt(parameters.get("age")[0]);
        String phoneNumber = parameters.get("phoneNumber")[0];
        String address = parameters.get("address")[0];

        // Crear un objeto Liferay con los datos del formulario
        Liferay liferay = new Liferay();
        liferay.setName(name);
        liferay.setAge(age);
        liferay.setPhoneNumber(phoneNumber);
        liferay.setAddress(address);

        // Llamar al servicio para agregar el nuevo cliente
        Response response = LiferayServices.addCustomer(liferay);

        // Redirigir a la vista adecuada según la respuesta del servicio
        Map<String, String> renderParameters = new HashMap<>();
        if (response.getStatus() == 200) {
            // Enviar una redirección a la vista de éxito
            renderParameters.put("success", "true");
        } else {
            // Enviar una redirección a la vista de error
            renderParameters.put("error", "true");
        }
    }
}



