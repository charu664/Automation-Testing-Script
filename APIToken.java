package TestRestAssured;

public class APIToken {
    public String assignToken(String moduleType,String tkn) {

        String token=null;

        if (moduleType.equalsIgnoreCase("admin")) {

            token= "eyJhbGciOiJodHRwOi8vd3d3LnczLm9yZy8yMDAxLzA0L3htbGRzaWctbW9yZSNobWFjLXNoYTUxMiIsInR5cCI6IkpXVCJ9.eyJodHRwOi8vc2NoZW1hcy54bWxzb2FwLm9yZy93cy8yMDA1LzA1L2lkZW50aXR5L2NsYWltcy9uYW1laWRlbnRpZmllciI6IjY1YzYyMWU0LWVkYWQtNDljMC05YWUyLTNlNzNmODc3MThjNCIsImh0dHA6Ly9zY2hlbWFzLnhtbHNvYXAub3JnL3dzLzIwMDUvMDUvaWRlbnRpdHkvY2xhaW1zL2VtYWlsYWRkcmVzcyI6ImFkbWluQGJpZ21vZnguY29tIiwiaHR0cDovL3NjaGVtYXMubWljcm9zb2Z0LmNvbS93cy8yMDA4LzA2L2lkZW50aXR5L2NsYWltcy9yb2xlIjpbIkFkbWluIiwiTWFuYWdlciJdLCJleHAiOjE3MTE5ODE1MzEsImlzcyI6Imh0dHA6Ly9sb2NhbGhvc3Q6NDAwMCIsImF1ZCI6Imh0dHA6Ly9sb2NhbGhvc3Q6NDAwMCJ9.prywqWe2ZOnhZI-37lXQRfhN1aeKwHBcsONTp98VvIYyxdy3mledernNBR5PIx9Y6yyPbCC_3GHgSWi7PGMT_A";
        } else if (moduleType.equalsIgnoreCase("user")) {

            token= "eyJhbGciOiJodHRwOi8vd3d3LnczLm9yZy8yMDAxLzA0L3htbGRzaWctbW9yZSNobWFjLXNoYTUxMiIsInR5cCI6IkpXVCJ9.eyJodHRwOi8vc2NoZW1hcy54bWxzb2FwLm9yZy93cy8yMDA1LzA1L2lkZW50aXR5L2NsYWltcy9uYW1laWRlbnRpZmllciI6IjJmMGRjZWY5LWEwMzYtNGYzZi05NGMxLTZjMTA5YTk2Nzk4MSIsImh0dHA6Ly9zY2hlbWFzLnhtbHNvYXAub3JnL3dzLzIwMDUvMDUvaWRlbnRpdHkvY2xhaW1zL2VtYWlsYWRkcmVzcyI6ImFkaXR5YS5kZXNobXVraEBmaW5hYml0cy5pbiIsImh0dHA6Ly9zY2hlbWFzLm1pY3Jvc29mdC5jb20vd3MvMjAwOC8wNi9pZGVudGl0eS9jbGFpbXMvcm9sZSI6IkNsaWVudCIsImV4cCI6MTcxMTcwNTA4OSwiaXNzIjoiaHR0cDovL2xvY2FsaG9zdDo0MDAwIiwiYXVkIjoiaHR0cDovL2xvY2FsaG9zdDo0MDAwIn0.QL28aqw8qkMbd6UabJYbX_8gOpAPNlvJmcbH2p5PLfcI_LcqrGetxRewLI0D66N8UZfWKcW1frfvJx70nXm-Mw";
        } else {


        }

        return token;
    }
}
