package jussa.quotation.food.model;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QuotationFoodDTO {

    private Integer id_boletim;
    private String date;
    private String guerraProductAtClassification;
    private String group;
    private String product;
    private String variety;
    private String classificação;
    private double minor_price;
    private double common_price;
    private double major_price;
    private String unity;
    private double weight;
    private double tolerance;


}
/*
*
* Boletim	Data	Guerra Produto + Classificação	Guerra	Grupo	Produto	Variedade	Classificação	Menor	Comum	Maior	Unidade	Peso	Tolerância
213	16/06/2023	1@193	1	FRUTAS	ABACATE	AVOCADO/HASS/FUERTE	A	3,9	4,95	6,23	KG	1	0

*
* */
