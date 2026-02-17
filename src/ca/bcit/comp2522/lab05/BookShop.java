package ca.bcit.comp2522.lab05;

import java.util.HashMap;
import java.util.Map;

public class BookShop
{
    private final Map<String, Novel> novels;

    public BookShop(final Map<String, Novel> novels)
    {
        novels = new HashMap<>();
    }
}
