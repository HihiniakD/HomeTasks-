package controller;

public interface RegexData {
    String REGEX_SURNAME_LAT = "^[A-Z][a-z]{1,14}";
    String REGEX_SURNAME_UKR = "^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{1,20}$";
    String REGEX_NICKNAME = "^[A-Z][a-z_0-9]{6,9}";
}
