package co.com.julianr0223.expenses_traker.entities;

import java.util.List;
public class Response {
    Long count;
    List<Entires> entries;
}

class Entires {
    String API;
    String Description;
}

