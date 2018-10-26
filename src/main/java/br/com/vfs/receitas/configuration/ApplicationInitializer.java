package br.com.vfs.receitas.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    /**
     * Definido classe que informa os controles
     * @return
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{
                ApplicationConfiguration.class
        };
    }

    /**
     * Nenhuma configuracao paar usar servlet
     * @return
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return null;
    }

    /**
     * Expondo os controllers abaixo do endpoint api
     * @return
     */
    @Override
    protected String[] getServletMappings() {
        return new String[]{
                "/api/*"
        };
    }
}
