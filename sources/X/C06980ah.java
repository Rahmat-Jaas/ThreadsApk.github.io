package X;

import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.0ah  reason: invalid class name and case insensitive filesystem */
public final class C06980ah {
    public static String A00(int i) {
        if (i == 1) {
            return "CRF_PLATFORM_NETWORK_FETCH_LOGGER_ANDROID";
        }
        if (i == 2) {
            return "CRF_PLATFORM_EDGE_INFLATION_ANDROID";
        }
        if (i == 17) {
            return "CRF_PLATFORM_CSR_STORAGE_INSERT_ANDROID";
        }
        if (i == 6067) {
            return "CRF_PLATFORM_CRF_RANKING_SIGNAL_DISTRIBUTION";
        }
        if (i == 7523) {
            return "CRF_PLATFORM_CSR_TAIL_LOAD_CACHE_TIMER";
        }
        if (i == 12793) {
            return "CRF_PLATFORM_CSR_THREADS_STATS";
        }
        if (i == 14294) {
            return "CRF_PLATFORM_CSR_THREADS";
        }
        switch (i) {
            case 4:
                return "CRF_PLATFORM_CRF_STORAGE_STATS";
            case 5:
                return "CRF_PLATFORM_CRF_INFRA_1ST_FETCH_ANDROID";
            case 6:
                return "CRF_PLATFORM_CRF_RANKING_SIGNAL_CREATION_ANDROID";
            case 7:
                return "CRF_PLATFORM_RANKING_SIGNAL_EXTRA_DATA_INFLATION";
            case 8:
                return "CRF_PLATFORM_CRF_DATA_SENT_TO_UI";
            default:
                switch (i) {
                    case 10:
                        return "CRF_PLATFORM_RANKING_SIGNAL_EXTRA_DATA_VALIDATION";
                    case 11:
                        return "CRF_PLATFORM_CRF_RECENT_VPV_TEMP";
                    case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                        return "CRF_PLATFORM_CRF_POOL_EDGE_RETRIEVAL";
                    default:
                        return "UNDEFINED_QPL_EVENT";
                }
        }
    }
}
