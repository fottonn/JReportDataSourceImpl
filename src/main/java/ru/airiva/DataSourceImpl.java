package ru.airiva;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRField;

import java.util.HashMap;

/**
 * @author Ivan
 */
public class DataSourceImpl implements JRDataSource {

    private static final HashMap<String, Object> fields = new HashMap<>();

    private static final String BRAND_LOGO = "brandLogo";
    private static final String TEXT_1 = "text1";
    private static final String TEXT_2 = "text2";
    private static final String TEXT_3 = "text3";
    private static final String TEXT_4 = "text4";
    private static final String PRICE = "price";
    private static final String NORMAL_PRICE = "normalPrice";
    private static final String EAN = "ean";
    private static final String MANUFACTURER = "manufacturerName";
    private static final String MAIN_ITEM_ID = "mainItemId";
    private static final String IS_TPC = "isTpc";
    private static final String IS_PROMO = "isPromo";
    private static final String PROMO_PRICE = "promoPrice";
    private static final String WEIGHT_TYPE_BUTTON = "weightTypeButton";
    private static final String WEIGHT_PRICE = "weightPrice";
    private static final String WEIGHT_PROMO_PRICE = "weightPromoPrice";
    private static final String WEIGHT_NORMAL_PRICE = "weightNormalPrice";
    private static final String EAN_CONTENT = "eanContent";
    private static final String TEXT_101 = "text101";
    private static final String TEXT_102 = "text102";
    private static final String TEXT_103 = "text103";
    private static final String TEXT_104 = "text104";
    private static final String TEXT_105 = "text105";
    private static final String TEXT_106 = "text106";
    private static final String TEXT_107 = "text107";
    private static final String TEXT_108 = "text108";
    private static final String TRADEMARK = "trademark";
    private static final String WEIGHT_TYPE_SUPPLIER_INFO = "weightTypeSupplierInfo";
    private static final String PLANOGRAMA = "planograma";
    private static final String BASE_QTY = "baseQty";
    private static final String DISCOUNT_VALUE = "discountValue";
    private static final String SPECIAL_PRICE = "specialPrice";
    private static final String PACK_PRICE = "packPrice";

    private DataSourceImpl() {
        fields.put(BRAND_LOGO, new ImageWrapper("logo.jpg"));
        fields.put(TEXT_1, "Икра Кабачковая 400г");
        fields.put(TEXT_2, "В жестяной банке");
        fields.put(TEXT_3, "");
        fields.put(TEXT_4, "");
        fields.put(PRICE, 19999.95d);
        fields.put(NORMAL_PRICE, 59999.99d);
        fields.put(PROMO_PRICE, 19999.88d);
        fields.put(EAN, "4813445000650");
        fields.put(MANUFACTURER, "КФ Ударница");
        fields.put(MAIN_ITEM_ID, "10795");
        fields.put(IS_TPC, Boolean.TRUE);
        fields.put(IS_PROMO, Boolean.TRUE);
        fields.put(WEIGHT_TYPE_BUTTON, "999");
        fields.put(WEIGHT_PRICE, "33333.56");
        fields.put(WEIGHT_PROMO_PRICE, "44444.66");
        fields.put(WEIGHT_NORMAL_PRICE, "8888.44");
        fields.put(EAN_CONTENT, "%0001079519999950");
        fields.put(TEXT_101, "12345678901234567890123456789012345678901234567890");
        fields.put(TEXT_102, "12345678901234567890123456789012345678901234567890");
        fields.put(TEXT_103, "12345678901234567890123456789012345678901234567890");
        fields.put(TEXT_104, "12345678901234567890123456789012345678901234567890");
        fields.put(TEXT_105, "12345678901234567890123456789012345678901234567890");
        fields.put(TEXT_106, "12345678901234567890123456789012345678901234567890");
        fields.put(TEXT_107, "12345678901234567890123456789012345678901234567890");
        fields.put(TEXT_108, "12345678901234567890123456789012345678901234567890");
        fields.put(TRADEMARK, "Торговая марка");
        fields.put(WEIGHT_TYPE_SUPPLIER_INFO, "999");
        fields.put(PLANOGRAMA, "002.001.79.10");
        fields.put(DISCOUNT_VALUE, 10);
        fields.put(BASE_QTY, 10);
        fields.put(SPECIAL_PRICE, "899.99");
        fields.put(PACK_PRICE, "8990.00");
    }

    private int counter = -1;

    @Override
    public boolean next() {
        if (counter < 0) {
            counter++;
            return true;
        }
        return false;
    }

    @Override
    public Object getFieldValue(JRField jrField) {
        return fields != null ? fields.get(jrField.getName()) : null;
    }

    public static JRDataSource createDatasource() {
        return new DataSourceImpl();
    }

}
