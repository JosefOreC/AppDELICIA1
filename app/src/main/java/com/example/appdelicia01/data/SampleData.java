package com.example.appdelicia01.data;

import com.example.appdelicia01.domain.model.Product;
import java.util.Arrays;
import java.util.List;

public class SampleData {
    // Usaremos URLs ficticias. En un proyecto real, estas apuntarían a un servidor.
    // También podrías usar IDs de recursos locales si las imágenes están en /res/drawable
    public static List<Product> products() {
        return Arrays.asList(
                new Product("p1","Torta de Chocolate",45.5,"https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.recetasgratis.net%2Freceta-de-torta-humeda-de-chocolate-decorada-47884.html&psig=AOvVaw3sHbw3vXKsiyEQV8qcst7L&ust=1759803402067000&source=images&cd=vfe&opi=89978449&ved=0CBUQjRxqFwoTCMC6l-HAjpADFQAAAAAdAAAAABAX"),
                new Product("p2","Cheesecake de Fresas",39.9,"https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.abc.es%2Frecetasderechupete%2Fpastel-de-queso-o-cheesecake-malamadre%2F21157%2F&psig=AOvVaw2wEytzxmeJV9xXLRIxVCOA&ust=1759803489000000&source=images&cd=vfe&opi=89978449&ved=0CBUQjRxqFwoTCLD-sIDBjpADFQAAAAAdAAAAABAE"),
                new Product("p3","Pie de Manzana",32.0,"https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.youtube.com%2Fwatch%3Fv%3DuQrlek8Pl4k&psig=AOvVaw3-vhroFGPI9JaljYNZhjwd&ust=1759803517485000&source=images&cd=vfe&opi=89978449&ved=0CBUQjRxqFwoTCPC_ho7BjpADFQAAAAAdAAAAABAE"),
                new Product("p4","Brownie Clásico",15.0,"https://www.google.com/url?sa=i&url=https%3A%2F%2Frecetasdecocina.elmundo.es%2F2018%2F03%2Fbrownie-chocolate-receta-facil.html&psig=AOvVaw3UUoXERBp2z-fGb2DfSrFt&ust=1759803551630000&source=images&cd=vfe&opi=89978449&ved=0CBUQjRxqFwoTCKCy_53BjpADFQAAAAAdAAAAABAE") // Producto extra
        );
    }
}