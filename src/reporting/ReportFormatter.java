package reporting;

public class ReportFormatter {

    public ReportFormatter(Object object, FormatType formateType){

    }

    private String convertObjectToXML(Object object){

        return "XML : <title>"+object.toString()+"</title>";
    }

    private String convertObjectToCSV(Object object){

        return "CSV : ,,, "+object.toString()+",,,,";
    }


}
