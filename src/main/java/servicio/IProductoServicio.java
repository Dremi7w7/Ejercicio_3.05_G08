/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import java.util.List;
import modelo.Producto;

/**
 *
 * @author Dremi7w7
 */
public interface IProductoServicio {
    public Producto crear(Producto producto);
    public List<Producto> listar();  
}
