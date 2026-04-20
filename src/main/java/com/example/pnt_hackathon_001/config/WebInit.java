package com.example.pnt_hackathon_001.config;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInit extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{AppConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return null;  // Không cần config riêng
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    // Tùy chọn: Cấu hình encoding UTF-8
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        super.onStartup(servletContext);
        servletContext.setRequestCharacterEncoding("UTF-8");
        servletContext.setResponseCharacterEncoding("UTF-8");
    }
}