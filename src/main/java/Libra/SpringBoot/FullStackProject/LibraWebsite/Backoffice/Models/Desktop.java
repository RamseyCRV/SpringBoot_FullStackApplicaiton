package Libra.SpringBoot.FullStackProject.LibraWebsite.Backoffice.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Desktop {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String description;
    private String price;
    private int inStock;
    private int unitsSold;
    private String image;

}
