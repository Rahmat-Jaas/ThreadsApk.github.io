package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;

/* renamed from: X.0nK  reason: invalid class name and case insensitive filesystem */
public final class C13260nK {
    public static String A00(int i) {
        if (i == 1) {
            return "TEST1234";
        }
        if (i == 2) {
            return "PERF_TEST2";
        }
        if (i == 3) {
            return "PERF_QUICKLOG";
        }
        if (i == 4) {
            return "PERF_SEQUENCELOG";
        }
        if (i == 5) {
            return "PERF_PERFLOG";
        }
        if (i == 7) {
            return "PERF_MEMORY_PROFILING";
        }
        if (i == 43) {
            return "PERF_FBLITE_SESSION_EVENT";
        }
        if (i == 60) {
            return "PERF_SCROLLING_OTHER_SURFACE";
        }
        if (i == 70) {
            return "PERF_BENCHMARK";
        }
        if (i == 3620) {
            return "PERF_TEST_ANJALI";
        }
        if (i == 19) {
            return "PERF_ELIGIBLE_FOR_INTERSTITIAL_TRIGGER";
        }
        if (i == 20) {
            return "PERF_RESTORE_INTERSTITIAL_TRIGGER_STATE";
        }
        if (i == 34) {
            return "PERF_FBLITE_CLIENT_TTI_SCREEN_READY";
        }
        if (i == 35) {
            return "PERF_FBLITE_CLIENT_TTI_SCREEN_DRAWN";
        }
        if (i == 50) {
            return "PERF_FBLITE_CLIENT_EVENT_MANAGER";
        }
        if (i == 51) {
            return "PERF_FBLITE_SESSION_TICKET_AVAILABLE";
        }
        if (i == 53) {
            return "PERF_FBLITE_CLIENT_SCROLL_PERF";
        }
        if (i == 54) {
            return "PERF_FBLITE_CLIENT_FRAME_RENDER";
        }
        if (i == 57) {
            return "PERF_QPL_CLIENT_TTI_TRACE";
        }
        if (i == 58) {
            return "PERF_QPL_CLIENT_TTI_TRACE_2";
        }
        switch (i) {
            case 22:
                return "PERF_RESTORE_LAZY_TRIGGER_IDS";
            case 23:
                return "PERF_READ_TRIGGER_TOIDS";
            case 24:
                return "PERF_GET_FETCH_INTERSTITIAL_RESULT";
            default:
                switch (i) {
                    case 28:
                        return "PERF_TOUCH_EVENT_LATENCY";
                    case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
                        return "PERF_FBLITE_CLIENT_INIT";
                    case 30:
                        return "PERF_FBLITE_CONNECTION_INIT";
                    case 31:
                        return "PERF_FBLITE_SESSION_ESTABLISHED";
                    case 32:
                        return "PERF_FBLITE_CLIENT_TTI";
                    default:
                        switch (i) {
                            case 64:
                                return "PERF_NFC_TEST";
                            case 65:
                                return "PERF_NFC_TEST_2";
                            case 66:
                                return "PERF_NFC_TEST_3";
                            default:
                                switch (i) {
                                    case 77:
                                        return "PERF_DEFAULT_TTRC_ANDROID";
                                    case 78:
                                        return "PERF_MESSENGER_WARMUP";
                                    case 79:
                                        return "PERF_MESSENGER_WARMUP_MB";
                                    default:
                                        return "UNDEFINED_QPL_EVENT";
                                }
                        }
                }
        }
    }
}
