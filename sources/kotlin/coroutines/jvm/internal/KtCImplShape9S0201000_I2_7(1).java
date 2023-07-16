package kotlin.coroutines.jvm.internal;

import X.C07530bf;
import X.C10300i6;
import X.C146958n9;
import X.C18190wL;
import X.C27236EjA;
import X.C62903b6;
import androidx.work.CoroutineWorker;
import ch.boye.httpclientandroidlib.client.utils.Rfc3492Idn;
import ch.boye.httpclientandroidlib.util.LangUtils;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000000_I2;
import com.facebook.redex.IDxFCollectorShape20S1200000_1_I2;
import com.facebook.redex.IDxFCollectorShape229S0100000_1_I2;
import com.facebook.redex.IDxFCollectorShape59S0300000_1_I2;
import com.facebook.redex.IDxFCollectorShape62S0300000_4_I2;
import com.facebook.redex.IDxFCollectorShape83S0200000_1_I2;
import com.facebook.redex.IDxFCollectorShape86S0200000_4_I2;
import com.instagram.debug.devoptions.debughead.linechart.LineChartAxesView;
import com.instagram.notifications.badging.ui.viewmodel.BaseBadgeViewModel$special$$inlined$filterCombine$2$2;
import com.instagram.nux.aymh.loginhandlers.CredentialsLoginHandler;
import com.instagram.nux.aymh.viewmodel.AymhViewModel;
import com.instagram.nux.ndx.api.NDXIGStepsAPI;
import com.instagram.nux.ndx.util.NdxStepsFetcher;
import com.instagram.payout.api.PayoutApi;
import com.instagram.quickpromotion.debug.devtool.IGDevToolPersistentStateHandler;
import com.instagram.reels.groupmention.api.GroupMentionStickerNetworkHelper;
import com.instagram.release.buildinfo.BuildInfoApi;
import com.instagram.rtc.interactor.RtcLoungeInteractor$loungeModel$$inlined$map$1$2;
import com.instagram.rtc.interactor.cowatch.RtcCoWatchPlaybackInteractor$playback$$inlined$map$1$2;
import com.instagram.rtc.interactor.screenshare.RtcScreenShareInteractor$screenShareButtonAvailable$$inlined$map$1$2;
import com.instagram.service.session.UserSession;
import go.Seq;
import java.util.Map;

public class KtCImplShape9S0201000_I2_7 extends C27236EjA {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtCImplShape9S0201000_I2_7(Object obj, C146958n9 r2, int i, int i2) {
        super(r2);
        this.A03 = i;
        this.A02 = obj;
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof KtCImplShape9S0201000_I2_7) || ((KtCImplShape9S0201000_I2_7) obj).A03 != i) {
            return false;
        }
        return true;
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.A03) {
            case 1:
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
            case 14:
            case 48:
                return ((IDxFCollectorShape83S0200000_1_I2) C18190wL.A0d(obj, this)).emit((Object) null, this);
            case 4:
                return ((BaseBadgeViewModel$special$$inlined$filterCombine$2$2) C18190wL.A0d(obj, this)).emit((Object) null, this);
            case 13:
                return ((CredentialsLoginHandler) C18190wL.A0e(obj, this)).A00((KtCSuperShape0S2000000_I2) null, (C10300i6) null, (String) null, (String) null, this);
            case 15:
                return AymhViewModel.A00((C62903b6) null, (AymhViewModel) C18190wL.A0e(obj, this), (C07530bf) null, this);
            case 16:
                return ((NDXIGStepsAPI) C18190wL.A0e(obj, this)).A00((UserSession) null, (String) null, this, 0);
            case LangUtils.HASH_SEED /*17*/:
                return ((NdxStepsFetcher) C18190wL.A0e(obj, this)).A00(0, this);
            case 18:
                return ((IDxFCollectorShape59S0300000_1_I2) C18190wL.A0d(obj, this)).emit((Object) null, this);
            case 20:
                return ((PayoutApi) C18190wL.A0e(obj, this)).A06((String) null, (String) null, this);
            case 21:
                return ((PayoutApi) C18190wL.A0e(obj, this)).A07((String) null, this);
            case 22:
                return ((PayoutApi) C18190wL.A0e(obj, this)).A08((String) null, this);
            case 23:
                return ((PayoutApi) C18190wL.A0e(obj, this)).A09(this, false);
            case 24:
                return ((CoroutineWorker) C18190wL.A0e(obj, this)).A05(this);
            case Rfc3492Idn.tmax /*26*/:
                return ((IGDevToolPersistentStateHandler) C18190wL.A0e(obj, this)).BKF((String) null, (Map) null, this);
            case 28:
            case 33:
            case 34:
            case Seq.RefTracker.REF_OFFSET /*42*/:
                return ((IDxFCollectorShape86S0200000_4_I2) C18190wL.A0d(obj, this)).emit((Object) null, this);
            case 30:
                return ((GroupMentionStickerNetworkHelper) C18190wL.A0e(obj, this)).A00((UserSession) null, this);
            case 31:
                return ((BuildInfoApi) C18190wL.A0e(obj, this)).A00(this);
            case 32:
                return ((IDxFCollectorShape62S0300000_4_I2) C18190wL.A0d(obj, this)).emit((Object) null, this);
            case Rfc3492Idn.skew /*38*/:
            case LineChartAxesView.AXIS_TICK_OFFSET /*40*/:
                return ((IDxFCollectorShape20S1200000_1_I2) C18190wL.A0d(obj, this)).emit((Object) null, this);
            case Seq.NULL_REFNUM /*41*/:
                return ((RtcLoungeInteractor$loungeModel$$inlined$map$1$2) C18190wL.A0d(obj, this)).emit((Object) null, this);
            case 43:
                return ((IDxFCollectorShape229S0100000_1_I2) C18190wL.A0e(obj, this)).emit((Object) null, this);
            case 44:
                return ((RtcCoWatchPlaybackInteractor$playback$$inlined$map$1$2) C18190wL.A0d(obj, this)).emit((Object) null, this);
            case 45:
                return ((RtcScreenShareInteractor$screenShareButtonAvailable$$inlined$map$1$2) C18190wL.A0d(obj, this)).emit((Object) null, this);
            default:
                return ((IDxFCollectorShape229S0100000_1_I2) C18190wL.A0d(obj, this)).emit((Object) null, this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtCImplShape9S0201000_I2_7(Object obj, C146958n9 r2, int i) {
        super(r2);
        this.A03 = i;
        this.A01 = obj;
    }
}
