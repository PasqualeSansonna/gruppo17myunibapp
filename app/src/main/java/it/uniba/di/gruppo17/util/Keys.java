package it.uniba.di.gruppo17.util;

public interface Keys {
    String EMAIL = "email";
    String PASSWORD = "password";
    String RENTALS_TOTAL_DURATION = "rentals_total_duration";
    String SERVER = "http://192.168.178.26/";
    String USER_AGENT = "Mozilla/5.0";
    String ID_UTENTE = "id";
    String WALLET = "wallet" ;
    String SHARED_PREFERENCES = "MovingFastPreferences";
    //Per controllo Google play services e permessi geolocalizzazione
    int REQUEST_RESOLVE_ERROR =1 ;
    String RESOLVING_ERROR_STATE_KEY = "RESOLVING_ERROR_STATE_KEY";
    int REQUEST_ACCESS_LOCATION = 2;

    //Per MapsFragment
    int RAGGIO = 2;
    int MAP_ANIMATION_DURATION = 600;
    float ZOOM = 13.0f;

    //rentFragment
    String RENT = "rent";
    //resultfragment
    String MAP_FRAGMENT = "map_fragment";
    String IN_RENT = "in_rent";
    String ID_RENT = "id_rent";
    String ID_SCOOTER = "id_scooter";
    String SERVICE = "START_SERVICE";
    String STOP_UPDATE_POSITION = "Stop update position";
    String START_UPDATE_POSITION = "Start update position";
    String RENT_FRAGMENT = "rent_fragment";

}
