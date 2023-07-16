package kotlin.coroutines.jvm.internal;

import X.AnonymousClass0LU;
import X.AnonymousClass0OU;
import X.AnonymousClass0YP;
import X.AnonymousClass0ZV;
import X.AnonymousClass1jB;
import X.AnonymousClass1o3;
import X.AnonymousClass1o4;
import X.AnonymousClass4Bh;
import X.C146958n9;
import X.C18220wO;
import X.C22171CKf;
import X.C35352Nc;
import X.C39142Kno;
import X.C63593hs;
import X.C70434En;
import android.view.Choreographer;
import ch.boye.httpclientandroidlib.client.utils.Rfc3492Idn;
import ch.boye.httpclientandroidlib.util.LangUtils;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.redex.IDxDestinationShape175S0000000_1_I2;
import com.instagram.debug.devoptions.debughead.linechart.LineChartAxesView;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import kotlin.Unit;

public class KtSLambdaShape0S0000000_I2 extends C39142Kno implements AnonymousClass0YP {
    public final int A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape0S0000000_I2(int i, C146958n9 r3) {
        super(2, r3);
        this.A00 = i;
    }

    public final C146958n9 create(Object obj, C146958n9 r4) {
        int i;
        switch (this.A00) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 3;
                break;
            case 4:
                i = 4;
                break;
            case 5:
                i = 5;
                break;
            case 6:
                i = 6;
                break;
            case 7:
                i = 7;
                break;
            case 8:
                i = 8;
                break;
            case 9:
                i = 9;
                break;
            case 10:
                i = 10;
                break;
            case 11:
                i = 11;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                i = 12;
                break;
            case 13:
                i = 13;
                break;
            case 14:
                i = 14;
                break;
            case 15:
                i = 15;
                break;
            case 16:
                i = 16;
                break;
            case LangUtils.HASH_SEED /*17*/:
                i = 17;
                break;
            case 18:
                i = 18;
                break;
            case 19:
                i = 19;
                break;
            case 20:
                i = 20;
                break;
            case 21:
                i = 21;
                break;
            case 22:
                i = 22;
                break;
            case 23:
                i = 23;
                break;
            case 24:
                i = 24;
                break;
            case 25:
                i = 25;
                break;
            case Rfc3492Idn.tmax /*26*/:
                i = 26;
                break;
            case 27:
                i = 27;
                break;
            case 28:
                i = 28;
                break;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
                i = 29;
                break;
            case 30:
                i = 30;
                break;
            case 31:
                i = 31;
                break;
            case 32:
                i = 32;
                break;
            case 33:
                i = 33;
                break;
            case 34:
                i = 34;
                break;
            case 35:
                i = 35;
                break;
            case Rfc3492Idn.base /*36*/:
                i = 36;
                break;
            case LangUtils.HASH_OFFSET /*37*/:
                i = 37;
                break;
            case Rfc3492Idn.skew /*38*/:
                i = 38;
                break;
            case 39:
                i = 39;
                break;
            case LineChartAxesView.AXIS_TICK_OFFSET /*40*/:
                i = 40;
                break;
            case Seq.NULL_REFNUM /*41*/:
                i = 41;
                break;
            case Seq.RefTracker.REF_OFFSET /*42*/:
                i = 42;
                break;
            case 43:
                i = 43;
                break;
            case 44:
                i = 44;
                break;
            case 45:
                i = 45;
                break;
            default:
                i = 46;
                break;
        }
        return new KtSLambdaShape0S0000000_I2(i, r4);
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.A00) {
            case 1:
            case 2:
                AnonymousClass0OU.A00(obj);
                return Choreographer.getInstance();
            case 11:
                AnonymousClass0OU.A00(obj);
                return AnonymousClass1o4.A00;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                AnonymousClass0OU.A00(obj);
                return AnonymousClass1o3.A00;
            case 19:
                AnonymousClass0OU.A00(obj);
                new AnonymousClass4Bh("error");
                return Unit.A00;
            case 20:
                AnonymousClass0OU.A00(obj);
                AnonymousClass0LU.A0B("SocialChannelPreviewHandler", "update_channel_invite api failed");
                return Unit.A00;
            case 21:
                AnonymousClass0OU.A00(obj);
                return new AnonymousClass1jB(new C35352Nc());
            case 23:
            case 25:
                AnonymousClass0OU.A00(obj);
                C63593hs.A02();
                return Unit.A00;
            case 24:
                AnonymousClass0OU.A00(obj);
                return "bad_response";
            case Rfc3492Idn.tmax /*26*/:
                AnonymousClass0OU.A00(obj);
                return "request_failed";
            case 27:
                AnonymousClass0OU.A00(obj);
                return new C70434En(new IDxDestinationShape175S0000000_1_I2(0));
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN:
                AnonymousClass0OU.A00(obj);
                return new C22171CKf(AnonymousClass0ZV.A00, false, true);
            default:
                AnonymousClass0OU.A00(obj);
                return Unit.A00;
        }
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((KtSLambdaShape0S0000000_I2) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
    }
}
