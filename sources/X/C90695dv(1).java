package X;

import ch.boye.httpclientandroidlib.util.LangUtils;
import com.facebook.papaya.log.LogSink;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.smartcapture.logging.SCEventNames;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.5dv  reason: invalid class name and case insensitive filesystem */
public final class C90695dv extends LogSink implements AnonymousClass0i1 {
    public final QuickPerformanceLogger A00;
    public final String A01;

    public C90695dv(QuickPerformanceLogger quickPerformanceLogger, String str) {
        C04220Ms.A0B(str, 2);
        this.A00 = quickPerformanceLogger;
        this.A01 = str;
    }

    public final void event(long j, long j2, long j3, int i, Map map, String str) {
        int i2;
        String str2;
        String str3;
        Map map2 = map;
        String str4 = str;
        C18190wL.A1S(map2, 4, str4);
        for (Integer num : AnonymousClass006.A00(22)) {
            switch (num.intValue()) {
                case 1:
                    i2 = 1;
                    break;
                case 2:
                    i2 = 2;
                    break;
                case 3:
                    i2 = 3;
                    break;
                case 4:
                    i2 = 4;
                    break;
                case 5:
                    i2 = 5;
                    break;
                case 6:
                    i2 = 6;
                    break;
                case 7:
                    i2 = 7;
                    break;
                case 8:
                    i2 = 8;
                    break;
                case 9:
                    i2 = 9;
                    break;
                case 10:
                    i2 = 10;
                    break;
                case 11:
                    i2 = 11;
                    break;
                case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                    i2 = 12;
                    break;
                case 13:
                    i2 = 13;
                    break;
                case 14:
                    i2 = 14;
                    break;
                case 15:
                    i2 = 15;
                    break;
                case 16:
                    i2 = 16;
                    break;
                case LangUtils.HASH_SEED /*17*/:
                    i2 = 17;
                    break;
                case 18:
                    i2 = 18;
                    break;
                case 19:
                    i2 = 19;
                    break;
                case 20:
                    i2 = 20;
                    break;
                case 21:
                    i2 = 21;
                    break;
                default:
                    i2 = 0;
                    break;
            }
            if (i2 == i) {
                QuickPerformanceLogger quickPerformanceLogger = this.A00;
                int intValue = num.intValue();
                switch (intValue) {
                    case 1:
                        str2 = "SUBMIT";
                        break;
                    case 2:
                        str2 = "SUBMIT_FINISH";
                        break;
                    case 3:
                        str2 = "LAUNCH";
                        break;
                    case 4:
                        str2 = "START";
                        break;
                    case 5:
                        str2 = "MATCH";
                        break;
                    case 6:
                        str2 = "MATCH_REJECTED";
                        break;
                    case 7:
                        str2 = "CHECKIN";
                        break;
                    case 8:
                        str2 = "CHECKIN_ACCEPTED";
                        break;
                    case 9:
                        str2 = "CHECKIN_REJECTED";
                        break;
                    case 10:
                        str2 = "DOWNLOAD_DATASET";
                        break;
                    case 11:
                        str2 = "DOWNLOAD_TASK";
                        break;
                    case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                        str2 = "EXECUTE";
                        break;
                    case 13:
                        str2 = "EXECUTE_FINISH";
                        break;
                    case 14:
                        str2 = "REPORT";
                        break;
                    case 15:
                        str2 = "UPLOAD";
                        break;
                    case 16:
                        str2 = "FINISH";
                        break;
                    case LangUtils.HASH_SEED /*17*/:
                        str2 = "CANCEL";
                        break;
                    case 18:
                        str2 = "TERMINATE";
                        break;
                    case 19:
                        str2 = "KILL_PROCESS";
                        break;
                    case 20:
                        str2 = "EARLY_TERMINATE";
                        break;
                    case 21:
                        str2 = "PUBLISH";
                        break;
                    default:
                        str2 = "ERROR";
                        break;
                }
                quickPerformanceLogger.markerPoint(188224997, str2);
                Iterator A0z = AnonymousClass0wJ.A0z(map2);
                while (A0z.hasNext()) {
                    Map.Entry A0o = C18180wK.A0o(A0z);
                    String A0p = C18200wM.A0p(A0o);
                    String A0u = C18230wP.A0u(A0o);
                    if (!AnonymousClass6XI.A00.contains(A0p)) {
                        quickPerformanceLogger.markerAnnotate(188224997, A0p, A0u);
                    }
                }
                if (intValue == 0) {
                    str3 = TraceFieldType.FailureReason;
                } else if (intValue == 17) {
                    str3 = SCEventNames.Params.SESSION_END_REASON;
                } else if (intValue == 6) {
                    str3 = C18170wI.A00(479);
                } else if (intValue == 19) {
                    quickPerformanceLogger.markerEnd(188224997, 105);
                    return;
                } else {
                    return;
                }
                quickPerformanceLogger.markerAnnotate(188224997, str3, str4);
                return;
            }
        }
        throw C18190wL.A0a("Unsupported event!");
    }

    public final void log(long j, long j2, long j3, int i, String str, int i2, String str2) {
    }

    public final void onUserSessionWillEnd(boolean z) {
        this.A00.endAllMarkers(4340, true);
    }
}
