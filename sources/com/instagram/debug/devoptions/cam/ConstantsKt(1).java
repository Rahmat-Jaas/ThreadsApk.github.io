package com.instagram.debug.devoptions.cam;

import X.AnonymousClass4WJ;
import X.C18180wK;
import java.util.Map;

public final class ConstantsKt {
    public static final Map MEDIA_KIT_REQUEST_PARAMS = AnonymousClass4WJ.A0G(C18180wK.A0p("summary", MEDIA_KIT_SUMMARY), C18180wK.A0p("sections", MEDIA_KIT_SECTIONS));
    public static final String MEDIA_KIT_SECTIONS = "\n    [\n  {\n    \"type\": \"TEXT\",\n    \"title\": \"About me\",\n    \"description\": \"My name is Chandra\"\n  },\n  {\n    \"type\": \"MEDIA_POSTS\",\n    \"title\": \"My favorite posts\",\n    \"media_posts\": {\n      \"media_items\": [\n        2922859620286383644\n      ],\n      \"hides_likes\": false\n    }\n  }\n]\n      ";
    public static final String MEDIA_KIT_SUMMARY = "\n      {\n        \"cover_media\": [],\n        \"description\": \"Add an introduction to tell brands more about yourself\",\n        \"id\": 18253503892110110,\n        \"owner_id\": 90010201392076,\n        \"title\": \"creator 2 Media Kit\"\n      }\n      ";

    public static final Map getMEDIA_KIT_REQUEST_PARAMS() {
        return MEDIA_KIT_REQUEST_PARAMS;
    }
}
