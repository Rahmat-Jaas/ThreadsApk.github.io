package kotlin.coroutines.jvm.internal;

import X.AnonymousClass0wJ;
import X.AnonymousClass23Z;
import X.C112056ou;
import X.C146418mD;
import X.C146958n9;
import X.C22228CPl;
import X.C27236EjA;
import X.KJX;
import android.content.Context;
import androidx.paging.PagingSource;
import ch.boye.httpclientandroidlib.client.utils.Rfc3492Idn;
import ch.boye.httpclientandroidlib.util.LangUtils;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.redex.IDxFCollectorShape229S0100000_1_I2;
import com.facebook.redex.IDxFCollectorShape83S0200000_1_I2;
import com.instagram.api.schemas.FanClubCategoryType;
import com.instagram.api.schemas.ProfileThemeType;
import com.instagram.debug.devoptions.debughead.linechart.LineChartAxesView;
import com.instagram.events.data.EventsGraphQLDataSource;
import com.instagram.explore.api.ExploreMediaPrefetchHelper$Companion;
import com.instagram.fanclub.api.FanClubApi;
import com.instagram.fanclub.gifting.FanClubGiftingApi;
import com.instagram.fanclub.memberlist.repository.FanClubMemberListRepository;
import com.instagram.fanclub.promovideo.FanClubPromoAndWelcomeVideoApi;
import com.instagram.fbpay.graphql.FBPayIGGraphQLQueryExecutor;
import com.instagram.groupprofiles.data.GroupProfileApiUtil;
import com.instagram.groupprofiles.data.GroupProfileRepository;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.service.session.UserSession;
import go.Seq;
import java.util.List;

public class KtCImplShape7S0201000_I2_5 extends C27236EjA {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public final Object invokeSuspend(Object obj) {
        switch (this.A03) {
            case 0:
                return ((EventsGraphQLDataSource) AnonymousClass0wJ.A0j(obj, this)).A04((String) null, (String) null, this);
            case 1:
                return ((EventsGraphQLDataSource) AnonymousClass0wJ.A0j(obj, this)).A07((String) null, this);
            case 2:
                return ((EventsGraphQLDataSource) AnonymousClass0wJ.A0j(obj, this)).A05((String) null, (String) null, this);
            case 3:
                return ((ExploreMediaPrefetchHelper$Companion) AnonymousClass0wJ.A0j(obj, this)).A01((Context) null, (C22228CPl) null, (UserSession) null, this);
            case 4:
                return ExploreMediaPrefetchHelper$Companion.A00((Context) null, (KJX) null, (ExploreMediaPrefetchHelper$Companion) AnonymousClass0wJ.A0j(obj, this), (UserSession) null, this);
            case 5:
                return ((FanClubApi) AnonymousClass0wJ.A0j(obj, this)).A04((String) null, (String) null, this);
            case 6:
                return ((FanClubApi) AnonymousClass0wJ.A0j(obj, this)).A0E((List) null, this, false);
            case 7:
                return ((FanClubApi) AnonymousClass0wJ.A0j(obj, this)).A0C((List) null, this);
            case 8:
                return ((FanClubApi) AnonymousClass0wJ.A0j(obj, this)).A0F(this);
            case 9:
                return ((FanClubApi) AnonymousClass0wJ.A0j(obj, this)).A07((String) null, this);
            case 10:
                return ((FanClubApi) AnonymousClass0wJ.A0j(obj, this)).A0K(this, false);
            case 11:
                return ((FanClubApi) AnonymousClass0wJ.A0j(obj, this)).A02((FanClubCategoryType) null, this, false);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return ((FanClubApi) AnonymousClass0wJ.A0j(obj, this)).A08((String) null, this);
            case 13:
                return ((FanClubApi) AnonymousClass0wJ.A0j(obj, this)).A09((String) null, this);
            case 14:
                return ((FanClubApi) AnonymousClass0wJ.A0j(obj, this)).A05((String) null, (String) null, this);
            case 15:
                return ((FanClubApi) AnonymousClass0wJ.A0j(obj, this)).A03((AnonymousClass23Z) null, (String) null, this);
            case 16:
                return ((FanClubApi) AnonymousClass0wJ.A0j(obj, this)).A0G(this);
            case LangUtils.HASH_SEED /*17*/:
                return ((FanClubApi) AnonymousClass0wJ.A0j(obj, this)).A0H(this);
            case 18:
                return ((FanClubApi) AnonymousClass0wJ.A0j(obj, this)).A0I(this);
            case 19:
                return ((FanClubApi) AnonymousClass0wJ.A0j(obj, this)).A0D((List) null, this);
            case 20:
                return ((FanClubApi) AnonymousClass0wJ.A0j(obj, this)).A06((String) null, (String) null, this);
            case 21:
                return ((FanClubApi) AnonymousClass0wJ.A0j(obj, this)).A0A((String) null, this, false, false);
            case 22:
                return ((FanClubApi) AnonymousClass0wJ.A0j(obj, this)).A0J(this);
            case 23:
            case 24:
            case 28:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
            case 30:
            case 31:
            case 32:
            case Rfc3492Idn.base /*36*/:
                this.A02 = obj;
                this.A00 |= Process.WAIT_RESULT_TIMEOUT;
                return ((IDxFCollectorShape229S0100000_1_I2) this.A01).emit((Object) null, this);
            case 25:
                return ((FanClubGiftingApi) AnonymousClass0wJ.A0j(obj, this)).A00((String) null, this);
            case Rfc3492Idn.tmax /*26*/:
                return ((FanClubMemberListRepository) AnonymousClass0wJ.A0j(obj, this)).A00(this);
            case 27:
                return ((FanClubMemberListRepository) AnonymousClass0wJ.A0j(obj, this)).A01(this);
            case 33:
                return FanClubPromoAndWelcomeVideoApi.A00((FanClubPromoAndWelcomeVideoApi) AnonymousClass0wJ.A0j(obj, this), this);
            case 34:
            case 35:
            case LangUtils.HASH_OFFSET /*37*/:
            case Rfc3492Idn.skew /*38*/:
            case LineChartAxesView.AXIS_TICK_OFFSET /*40*/:
            case Seq.NULL_REFNUM /*41*/:
                this.A02 = obj;
                this.A00 |= Process.WAIT_RESULT_TIMEOUT;
                return ((IDxFCollectorShape83S0200000_1_I2) this.A01).emit((Object) null, this);
            case 39:
                return ((FBPayIGGraphQLQueryExecutor) AnonymousClass0wJ.A0j(obj, this)).A00((C146418mD) null, this);
            case Seq.RefTracker.REF_OFFSET /*42*/:
                return ((GroupProfileApiUtil) AnonymousClass0wJ.A0j(obj, this)).A04((UserSession) null, (String) null, (String) null, this);
            case 43:
                return ((GroupProfileApiUtil) AnonymousClass0wJ.A0j(obj, this)).A06((UserSession) null, (String) null, this);
            case 44:
                return ((GroupProfileApiUtil) AnonymousClass0wJ.A0j(obj, this)).A03((UserSession) null, (String) null, (String) null, (String) null, (String) null, this, false, false, false);
            case 45:
                return ((GroupProfileApiUtil) AnonymousClass0wJ.A0j(obj, this)).A07((UserSession) null, (String) null, this);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN:
                return ((GroupProfileApiUtil) AnonymousClass0wJ.A0j(obj, this)).A05((UserSession) null, (String) null, (String) null, this);
            case 47:
                return ((GroupProfileApiUtil) AnonymousClass0wJ.A0j(obj, this)).A02((ProfileThemeType) null, (UserSession) null, (String) null, (String) null, (String) null, this);
            case 48:
                return ((PagingSource) AnonymousClass0wJ.A0j(obj, this)).A01((C112056ou) null, this);
            default:
                return ((GroupProfileRepository) AnonymousClass0wJ.A0j(obj, this)).A07((String) null, this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtCImplShape7S0201000_I2_5(Object obj, C146958n9 r2, int i, int i2) {
        super(r2);
        this.A03 = i;
        this.A02 = obj;
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof KtCImplShape7S0201000_I2_5) || ((KtCImplShape7S0201000_I2_5) obj).A03 != i) {
            return false;
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtCImplShape7S0201000_I2_5(Object obj, C146958n9 r2, int i) {
        super(r2);
        this.A03 = i;
        this.A01 = obj;
    }
}
