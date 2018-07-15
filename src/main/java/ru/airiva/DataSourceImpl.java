package ru.airiva;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;

import java.util.Date;
import java.util.HashMap;

/**
 * @author Ivan
 */
public class DataSourceImpl implements JRDataSource {

    private static final HashMap<String, Object> fields = new HashMap<>();

    private static final String DETAIL = "detail";
    private static final String DATE = "date";
    private static final String IMAGE = "image";

    private DataSourceImpl() {
        fields.put(DETAIL, "Hello, world!!!");
        fields.put(DATE, new Date());
        fields.put(IMAGE, new ImageWrapper("/mnt/tomd/jasper/sc_logo_rus.jpg"));
    }

    @Override
    public boolean next() throws JRException {
        return !fields.isEmpty();
    }

    @Override
    public Object getFieldValue(JRField jrField) throws JRException {

        String name = jrField.getName();
        Object o = null;
        if (fields.containsKey(name)) {
            o = fields.get(name);
            fields.remove(name);
        }
        return o;
    }

    public static JRDataSource createDatasource() {
        return new DataSourceImpl();
    }

}
