package filters;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;
import java.time.LocalDateTime;

@WebFilter("/load-book")
public class UploadFilter implements Filter {
  @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Book upload time:" + LocalDateTime.now());
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
