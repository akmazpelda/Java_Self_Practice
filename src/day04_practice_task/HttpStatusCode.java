package day04_practice_task;

public class HttpStatusCode {

    public static void main(String[] args) {


        int statusCode = 700;
        String result = switch (statusCode) {
            case 200 -> "OK";
            case 201 -> "Created";
            case 202 -> "Accepted";
            case 301 -> "Moved Permanently";
            case 303 -> "See Other";
            case 304 -> "Not Modified";
            case 307 -> "Temporary Redirect";
            case 400 -> "Bad Request";
            case 401 -> "Unauthorized";
            case 403 -> "Forbidden";
            case 404 -> " Not Found";
            case 410 -> "Gone";
            case 500 -> "Internal Server Error";
            case 503 -> "Service Unavailable";
            default -> " Invalid status code" + statusCode;
        };

        System.out.println(result);

        }


    }

