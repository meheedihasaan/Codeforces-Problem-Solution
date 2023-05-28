import java.util.HashMap;

public class QRCodeDecoder {
    public static void main(String[] args) {
        String qrCode = "0161119410206mehedi0307rangpur04230108sonamoni0207rangpur05290105ideal0206Bogura";

        HashMap<String, String> fieldMap = new HashMap<>();
        fieldMap.put("01", "Role");
        fieldMap.put("02", "Name");
        fieldMap.put("03", "Address");
        fieldMap.put("0401", "School Name");
        fieldMap.put("0402", "School Address");
        fieldMap.put("0501", "College Name");
        fieldMap.put("0502", "College Address");

        HashMap<String, String> studentInfo = extractStudentInfo(qrCode, fieldMap);
        System.out.println(studentInfo);
    }

    public static HashMap<String, String> extractStudentInfo(String qrCode, HashMap<String, String> fieldMap) {
        HashMap<String, String> studentInfo = new HashMap<>();
        int index = 0;
        while (index < qrCode.length()) {
            String objectId = qrCode.substring(index, index + 2);
            String lengthStr = qrCode.substring(index + 2, index + 4);
            int length = Integer.parseInt(lengthStr);
            String value = qrCode.substring(index + 4, index + 4 + length);

            String fieldName = fieldMap.getOrDefault(objectId, "");
            if (!fieldName.isEmpty()) {
                if (fieldName.equals("School") || fieldName.equals("College")) {
                    HashMap<String, String> nestedData = extractNestedData(value, fieldMap);
                    studentInfo.putAll(nestedData);
                } else {
                    studentInfo.put(fieldName, value);
                }
            }

            index += 4 + length;
        }
        return studentInfo;
    }

    public static HashMap<String, String> extractNestedData(String value, HashMap<String, String> fieldMap) {
        HashMap<String, String> nestedData = new HashMap<>();
        int index = 0;
        while (index < value.length()) {
            String objectId = value.substring(index, index + 4);
            String lengthStr = value.substring(index + 4, index + 6);
            int length = Integer.parseInt(lengthStr);
            String nestedValue = value.substring(index + 6, index + 6 + length);

            String fieldName = fieldMap.getOrDefault(objectId, "");
            if (!fieldName.isEmpty()) {
                nestedData.put(fieldName, nestedValue);
            }

            index += 6 + length;
        }
        return nestedData;
    }
}
