package filters;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;
import java.time.LocalDateTime;

@WebFilter("/book")
public class DownloadFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Book download time:" + LocalDateTime.now());
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
