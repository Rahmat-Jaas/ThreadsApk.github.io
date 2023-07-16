package X;

import ch.boye.httpclientandroidlib.client.utils.Rfc3492Idn;
import ch.boye.httpclientandroidlib.util.LangUtils;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import go.Seq;

/* renamed from: X.0aE  reason: invalid class name and case insensitive filesystem */
public final class C06710aE {
    public static String A00(int i) {
        if (i == 1) {
            return "COMPONENTS_CALCULATE_LAYOUT";
        }
        if (i == 2) {
            return "COMPONENTS_CREATE_LAYOUT";
        }
        if (i == 3) {
            return "COMPONENTS_CSS_LAYOUT";
        }
        if (i == 4) {
            return "COMPONENTS_COLLECT_RESULTS";
        }
        if (i == 6) {
            return "COMPONENTS_PREPARE_MOUNT";
        }
        if (i == 7) {
            return "COMPONENTS_MOUNT";
        }
        if (i == 10) {
            return "COMPONENTS_SHOULD_UPDATE_REFERENCE_LAYOUT_MISMATCH";
        }
        if (i == 11) {
            return "COMPONENTS_PRE_ALLOCATE_MOUNT_CONTENT";
        }
        if (i == 39) {
            return "COMPONENTS_RESUME_CALCULATE_LAYOUT_STATE";
        }
        if (i == 3234) {
            return "COMPONENTS_SURFACE_UNTRUSTED_CALLER";
        }
        if (i == 4027) {
            return "COMPONENTS_COMPONENT_RESOLVE";
        }
        if (i == 9545) {
            return "COMPONENTS_COMPONENT_RESOLVE_LAYOUT_CREATION";
        }
        if (i == 11951) {
            return "COMPONENTS_CALCULATE_RESOLVE";
        }
        if (i == 11985) {
            return "COMPONENTS_COMPONENT_PREPARE";
        }
        if (i == 16282) {
            return "COMPONENTS_CALCULATE_RESOLUTION_RESULT";
        }
        switch (i) {
            case 25:
                return "COMPONENTS_SECTIONS_INITIAL_TTI";
            case Rfc3492Idn.tmax /*26*/:
                return "COMPONENTS_STETHO_UPDATE_COMPONENT";
            case 27:
                return "COMPONENTS_STETHO_INSPECT_COMPONENT";
            case 28:
                return "COMPONENTS_FETCH_GRAPHQL";
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
                return "COMPONENTS_DUPLICATE_KEY";
            case 30:
                return "COMPONENTS_SECTIONS_DATA_DIFF_CALCULATE_DIFF";
            case 31:
                return "COMPONENTS_SECTIONS_SET_ROOT";
            case 32:
                return "COMPONENTS_SECTIONS_ON_CREATE_CHILDREN";
            case 33:
                return "COMPONENTS_SECTIONS_CREATE_NEW_TREE";
            case 34:
                return "COMPONENTS_SECTIONS_GENERATE_CHANGESET";
            case 35:
                return "COMPONENTS_CALCULATE_LAYOUT_STATE";
            case Rfc3492Idn.base /*36*/:
                return "COMPONENTS_DRAW";
            case LangUtils.HASH_OFFSET /*37*/:
                return "COMPONENTS_BENCHMARK_RUN";
            default:
                switch (i) {
                    case Seq.NULL_REFNUM /*41*/:
                        return "COMPONENTS_LAYOUT_STATE_FUTURE_GET_WAIT";
                    case Seq.RefTracker.REF_OFFSET /*42*/:
                        return "COMPONENTS_INIT_RANGE";
                    case 43:
                        return "COMPONENTS_PROCESS_VISIBILITY_OUTPUTS";
                    default:
                        return "UNDEFINED_QPL_EVENT";
                }
        }
    }
}
