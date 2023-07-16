package kotlin.coroutines.jvm.internal;

import X.C146958n9;
import X.C18210wN;
import X.C27236EjA;
import X.C86104wH;
import X.C86124wJ;
import ch.boye.httpclientandroidlib.client.utils.Rfc3492Idn;
import ch.boye.httpclientandroidlib.util.LangUtils;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.redex.IDxFCollectorShape230S0100000_2_I2;
import com.facebook.redex.IDxFCollectorShape60S0300000_2_I2;
import com.facebook.redex.IDxFCollectorShape84S0200000_2_I2;
import com.facebook.redex.IDxFCollectorShape87S0200000_7_I2;
import com.instagram.archive.data.ArchiveStoryRepository;
import com.instagram.arp.api.AvatarAddonsApiController;
import com.instagram.arp.api.AvatarProfilePictureApiController;
import com.instagram.arp.profilepicture.repository.EditAvatarProfilePictureRepository;
import com.instagram.arp.profilepicture.upsell.AvatarProfilePictureUpsellViewModel;
import com.instagram.barcelona.common.ui.pulltorefresh.PullRefreshNestedScrollConnection;
import com.instagram.barcelona.onboarding.data.OnboardingRespository;
import com.instagram.barcelona.profile.api.FollowingGraphApi;
import com.instagram.barcelona.profile.api.ImportFromInstagramApi;
import com.instagram.brandedcontent.ads.repository.BrandedContentAdsApi;
import com.instagram.brandedcontent.repository.BrandedContentApi;
import com.instagram.debug.devoptions.debughead.linechart.LineChartAxesView;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.service.session.UserSession;
import go.Seq;
import java.util.List;

public class KtCImplShape3S0201000_I2_1 extends C27236EjA {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtCImplShape3S0201000_I2_1(Object obj, C146958n9 r2, int i) {
        super(r2);
        this.A03 = i;
        this.A01 = obj;
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof KtCImplShape3S0201000_I2_1) || ((KtCImplShape3S0201000_I2_1) obj).A03 != i) {
            return false;
        }
        return true;
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.A03) {
            case 0:
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
            case 13:
            case 14:
            case 16:
            case 27:
            case 31:
                C86124wJ.A1T(obj, this);
                return ((IDxFCollectorShape230S0100000_2_I2) this.A01).emit((Object) null, this);
            case 1:
                return ((ArchiveStoryRepository) C86104wH.A0n(obj, this)).A00(this);
            case 2:
            case 3:
            case 4:
            case 15:
            case 18:
            case 22:
            case Rfc3492Idn.tmax /*26*/:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
            case 30:
            case 44:
                C86124wJ.A1T(obj, this);
                return ((IDxFCollectorShape84S0200000_2_I2) this.A01).emit((Object) null, this);
            case 5:
                return ((AvatarAddonsApiController) C86104wH.A0n(obj, this)).A00(this);
            case 6:
                return ((AvatarProfilePictureApiController) C86104wH.A0n(obj, this)).A02(this);
            case 7:
                return ((AvatarProfilePictureApiController) C86104wH.A0n(obj, this)).A00(0, this);
            case 8:
                return ((AvatarProfilePictureApiController) C86104wH.A0n(obj, this)).A03(this);
            case 9:
                return ((AvatarProfilePictureApiController) C86104wH.A0n(obj, this)).A01((String) null, (String) null, this);
            case 10:
                return EditAvatarProfilePictureRepository.A00((EditAvatarProfilePictureRepository) C86104wH.A0n(obj, this), this);
            case 11:
                return AvatarProfilePictureUpsellViewModel.A01((AvatarProfilePictureUpsellViewModel) C86104wH.A0n(obj, this), this);
            case LangUtils.HASH_SEED /*17*/:
                return ((PullRefreshNestedScrollConnection) C86104wH.A0n(obj, this)).CBr(this, 0);
            case 19:
            case 20:
                C86124wJ.A1T(obj, this);
                return ((IDxFCollectorShape60S0300000_2_I2) this.A01).emit((Object) null, this);
            case 21:
                C86124wJ.A1T(obj, this);
                throw C18210wN.A0W("emit");
            case 23:
                C86124wJ.A1T(obj, this);
                throw C18210wN.A0W("emit");
            case 24:
                C86124wJ.A1T(obj, this);
                throw C18210wN.A0W("emit");
            case 25:
                C86124wJ.A1T(obj, this);
                throw C18210wN.A0W("emit");
            case 28:
                return ((OnboardingRespository) C86104wH.A0n(obj, this)).A02((UserSession) null, this);
            case 32:
                return FollowingGraphApi.A00((FollowingGraphApi) C86104wH.A0n(obj, this), (String) null, (String) null, (String) null, this);
            case 33:
                return ((FollowingGraphApi) C86104wH.A0n(obj, this)).A01((List) null, this);
            case 34:
                return ((ImportFromInstagramApi) C86104wH.A0n(obj, this)).A00(this);
            case 35:
                return ((BrandedContentAdsApi) C86104wH.A0n(obj, this)).A00((String) null, this);
            case Rfc3492Idn.base /*36*/:
                return ((BrandedContentAdsApi) C86104wH.A0n(obj, this)).A04(this);
            case LangUtils.HASH_OFFSET /*37*/:
                return ((BrandedContentAdsApi) C86104wH.A0n(obj, this)).A01((String) null, this);
            case Rfc3492Idn.skew /*38*/:
                return ((BrandedContentAdsApi) C86104wH.A0n(obj, this)).A02((String) null, this);
            case 39:
                return ((BrandedContentAdsApi) C86104wH.A0n(obj, this)).A03((String) null, this);
            case LineChartAxesView.AXIS_TICK_OFFSET /*40*/:
            case Seq.NULL_REFNUM /*41*/:
            case Seq.RefTracker.REF_OFFSET /*42*/:
            case 43:
                C86124wJ.A1T(obj, this);
                return ((IDxFCollectorShape87S0200000_7_I2) this.A01).emit((Object) null, this);
            case 45:
                return ((BrandedContentApi) C86104wH.A0n(obj, this)).A07((String) null, this);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN:
                return ((BrandedContentApi) C86104wH.A0n(obj, this)).A0C(this);
            case 47:
                return ((BrandedContentApi) C86104wH.A0n(obj, this)).A04((String) null, (String) null, this);
            case 48:
                return ((BrandedContentApi) C86104wH.A0n(obj, this)).A0D(this);
            default:
                return ((BrandedContentApi) C86104wH.A0n(obj, this)).A0B((List) null, this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtCImplShape3S0201000_I2_1(Object obj, C146958n9 r2, int i, int i2) {
        super(r2);
        this.A03 = i;
        this.A02 = obj;
    }
}
