package kotlin.coroutines.jvm.internal;

import X.AnonymousClass0gG;
import X.AnonymousClass0wJ;
import X.BKU;
import X.C146958n9;
import X.C170779vY;
import X.C25624Dp1;
import X.C25646DpQ;
import X.C26743EUq;
import X.C27236EjA;
import X.C62903b6;
import X.GKK;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.fragment.app.FragmentActivity;
import androidx.work.CoroutineWorker;
import ch.boye.httpclientandroidlib.client.utils.Rfc3492Idn;
import ch.boye.httpclientandroidlib.util.LangUtils;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.redex.IDxFCollectorShape232S0100000_4_I2;
import com.facebook.redex.IDxFCollectorShape86S0200000_4_I2;
import com.instagram.api.schemas.Achievement;
import com.instagram.api.schemas.FanClubCategoryType;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.creation.capture.quickcapture.undo.model.UndoReelMediaEditsViewModel;
import com.instagram.creator.modules.viewmodel.AchievementDetailsViewModel;
import com.instagram.debug.devoptions.debughead.linechart.LineChartAxesView;
import com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository;
import com.instagram.direct.headmojis.effects.HeadmojiEffectRenderer;
import com.instagram.direct.headmojis.service.HeadmojiRepository;
import com.instagram.direct.shareexistingthread.ExistingThreadSheetFragment;
import com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar;
import com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.sync.ContentFilterDictionaryListLoader;
import com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.sync.ContentFilterDictionaryPatternsLoader;
import com.instagram.direct.wellbeing.safetyecosystem.mutedwords.dictionary.data.DictionaryRepository;
import com.instagram.direct.wellbeing.safetyecosystem.mutedwords.impl.HiddenWordsPostsDictionary;
import com.instagram.events.data.EventsGraphQLDataSource;
import com.instagram.events.data.EventsRepository;
import com.instagram.explore.api.ExploreBackgroundPrefetchWorker;
import com.instagram.explore.api.ExploreClientMediaPrefetchWorker;
import com.instagram.fanclub.api.FanClubGiftOptionsResponseImpl;
import com.instagram.fanclub.consideration.FanClubConsiderationRepository;
import com.instagram.fanclub.consideration.FanClubConsiderationViewModel;
import com.instagram.fanclub.creatorlist.SubscribedAndRecommendedCreatorListRepository;
import com.instagram.fanclub.gifting.FanClubGiftingViewModel;
import com.instagram.fanclub.memberlist.repository.CreatorMessagingSelectionScreenRepository;
import com.instagram.fanclub.memberlist.repository.FanClubMemberListCategoryRepository;
import com.instagram.fanclub.memberlist.viewmodel.FanClubMemberListViewModel;
import com.instagram.fanclub.preview.impl.FanClubContentPreviewInteractorImpl;
import com.instagram.fanclub.promovideo.FanClubPromoAndWelcomeVideoApi;
import com.instagram.fanclub.settings.repository.FanClubSettingsRecommendationsRepository;
import com.instagram.fanclub.settings.repository.FanClubSettingsRepository;
import com.instagram.feed.media.flashmedia.FlashMediaLocalDataSource;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.service.session.UserSession;
import go.Seq;
import java.io.File;
import java.util.Collection;
import java.util.List;

public class KtCImplShape3S0301000_I2_2 extends C27236EjA {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public final Object invokeSuspend(Object obj) {
        switch (this.A04) {
            case 0:
                return ((UndoReelMediaEditsViewModel) AnonymousClass0wJ.A0i(obj, this)).A06(this);
            case 1:
                return ((IDxFCollectorShape232S0100000_4_I2) AnonymousClass0wJ.A0i(obj, this)).A01((C62903b6) null, this);
            case 2:
                return AchievementDetailsViewModel.A00((Achievement) null, (AchievementDetailsViewModel) AnonymousClass0wJ.A0i(obj, this), this);
            case 3:
                return ((IDxFCollectorShape232S0100000_4_I2) AnonymousClass0wJ.A0i(obj, this)).A03((C62903b6) null, this);
            case 4:
                return ((IDxFCollectorShape86S0200000_4_I2) AnonymousClass0wJ.A0i(obj, this)).A01((AnonymousClass0gG) null, this);
            case 5:
                return ((DirectCardGalleryRepository) AnonymousClass0wJ.A0i(obj, this)).A00(this);
            case 6:
                return ((HeadmojiEffectRenderer.Companion) AnonymousClass0wJ.A0i(obj, this)).A00((Context) null, (Bitmap) null, (GKK) null, (UserSession) null, this, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            case 7:
                return HeadmojiEffectRenderer.A03((HeadmojiEffectRenderer) AnonymousClass0wJ.A0i(obj, this), this);
            case 8:
                return HeadmojiEffectRenderer.A00((CameraAREffect) null, (HeadmojiEffectRenderer) AnonymousClass0wJ.A0i(obj, this), this);
            case 9:
                return ((HeadmojiRepository) AnonymousClass0wJ.A0i(obj, this)).A07(this);
            case 10:
                return HeadmojiRepository.A03((HeadmojiRepository) AnonymousClass0wJ.A0i(obj, this), this);
            case 11:
                return ((ExistingThreadSheetFragment) AnonymousClass0wJ.A0i(obj, this)).A00(this);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return ContentFilterDictionaryRegistrar.A00((ContentFilterDictionaryRegistrar) AnonymousClass0wJ.A0i(obj, this), (List) null, this);
            case 13:
                return C25646DpQ.A00((C25646DpQ) AnonymousClass0wJ.A0i(obj, this), this);
            case 14:
                return ((ContentFilterDictionaryListLoader) AnonymousClass0wJ.A0i(obj, this)).A00((UserSession) null, (List) null, (List) null, this);
            case 15:
                return ((ContentFilterDictionaryPatternsLoader) AnonymousClass0wJ.A0i(obj, this)).A00((UserSession) null, (String) null, (String) null, this, 0);
            case 16:
                return ((DictionaryRepository) AnonymousClass0wJ.A0i(obj, this)).A01(this);
            case LangUtils.HASH_SEED /*17*/:
                return ((HiddenWordsPostsDictionary) AnonymousClass0wJ.A0i(obj, this)).B0D(this, false);
            case 18:
                return C25624Dp1.A00((C25624Dp1) AnonymousClass0wJ.A0i(obj, this), this);
            case 19:
                return ((EventsGraphQLDataSource) AnonymousClass0wJ.A0i(obj, this)).A01((File) null, this);
            case 20:
                return ((EventsRepository) AnonymousClass0wJ.A0i(obj, this)).A04((C26743EUq) null, (Integer) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, this);
            case 21:
                return ((EventsRepository) AnonymousClass0wJ.A0i(obj, this)).A09((String) null, this);
            case 22:
                return ((EventsRepository) AnonymousClass0wJ.A0i(obj, this)).A05((String) null, (String) null, (String) null, this);
            case 23:
                return ((EventsRepository) AnonymousClass0wJ.A0i(obj, this)).A06((String) null, (String) null, this);
            case 24:
                return ((EventsRepository) AnonymousClass0wJ.A0i(obj, this)).A0A((String) null, this);
            case 25:
                return ((EventsRepository) AnonymousClass0wJ.A0i(obj, this)).A07((String) null, (String) null, this);
            case Rfc3492Idn.tmax /*26*/:
                return ((EventsRepository) AnonymousClass0wJ.A0i(obj, this)).A08((String) null, (String) null, this);
            case 27:
                return ((CoroutineWorker) AnonymousClass0wJ.A0i(obj, this)).A05(this);
            case 28:
                return ExploreBackgroundPrefetchWorker.A00((ExploreBackgroundPrefetchWorker) AnonymousClass0wJ.A0i(obj, this), this);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
                return ExploreClientMediaPrefetchWorker.A00((ExploreClientMediaPrefetchWorker) AnonymousClass0wJ.A0i(obj, this), this);
            case 30:
                return ((FanClubConsiderationRepository) AnonymousClass0wJ.A0i(obj, this)).A01((String) null, this);
            case 31:
                return ((FanClubConsiderationRepository) AnonymousClass0wJ.A0i(obj, this)).A02((String) null, this, false);
            case 32:
                return FanClubConsiderationViewModel.A05((FanClubConsiderationViewModel) AnonymousClass0wJ.A0i(obj, this), this);
            case 33:
                return SubscribedAndRecommendedCreatorListRepository.A00((SubscribedAndRecommendedCreatorListRepository) AnonymousClass0wJ.A0i(obj, this), (String) null, this);
            case 34:
                return SubscribedAndRecommendedCreatorListRepository.A01((SubscribedAndRecommendedCreatorListRepository) AnonymousClass0wJ.A0i(obj, this), (String) null, this);
            case 35:
                return ((SubscribedAndRecommendedCreatorListRepository) AnonymousClass0wJ.A0i(obj, this)).A02(this);
            case Rfc3492Idn.base /*36*/:
                return ((SubscribedAndRecommendedCreatorListRepository) AnonymousClass0wJ.A0i(obj, this)).A03(this);
            case LangUtils.HASH_OFFSET /*37*/:
                return FanClubGiftingViewModel.A00((FragmentActivity) null, (FanClubGiftOptionsResponseImpl.XigUserByIgidV2.FanClub.Package.GiftOptions) null, (FanClubGiftingViewModel) AnonymousClass0wJ.A0i(obj, this), this);
            case Rfc3492Idn.skew /*38*/:
                return ((CreatorMessagingSelectionScreenRepository) AnonymousClass0wJ.A0i(obj, this)).A01(this);
            case 39:
                return ((CreatorMessagingSelectionScreenRepository) AnonymousClass0wJ.A0i(obj, this)).A02(this);
            case LineChartAxesView.AXIS_TICK_OFFSET /*40*/:
                return ((CreatorMessagingSelectionScreenRepository) AnonymousClass0wJ.A0i(obj, this)).A00((String) null, (String) null, this);
            case Seq.NULL_REFNUM /*41*/:
                return ((FanClubMemberListCategoryRepository) AnonymousClass0wJ.A0i(obj, this)).A00((FanClubCategoryType) null, this, false);
            case Seq.RefTracker.REF_OFFSET /*42*/:
                return FanClubMemberListViewModel.A00((FanClubMemberListViewModel) AnonymousClass0wJ.A0i(obj, this), this);
            case 43:
                return ((FanClubContentPreviewInteractorImpl) AnonymousClass0wJ.A0i(obj, this)).AEY((BKU) null, this, false);
            case 44:
                return ((FanClubPromoAndWelcomeVideoApi) AnonymousClass0wJ.A0i(obj, this)).A01(this);
            case 45:
                return ((FanClubSettingsRecommendationsRepository) AnonymousClass0wJ.A0i(obj, this)).A00(this);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN:
                return ((FanClubSettingsRecommendationsRepository) AnonymousClass0wJ.A0i(obj, this)).A01(this);
            case 47:
                return ((FanClubSettingsRepository) AnonymousClass0wJ.A0i(obj, this)).A00(this);
            case 48:
                return ((FlashMediaLocalDataSource) AnonymousClass0wJ.A0i(obj, this)).A00((C170779vY) null, (Collection) null, this, 0);
            default:
                return ((FlashMediaLocalDataSource) AnonymousClass0wJ.A0i(obj, this)).A01((C170779vY) null, (Collection) null, this, 0);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtCImplShape3S0301000_I2_2(Object obj, C146958n9 r2, int i) {
        super(r2);
        this.A04 = i;
        this.A03 = obj;
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof KtCImplShape3S0301000_I2_2) || ((KtCImplShape3S0301000_I2_2) obj).A04 != i) {
            return false;
        }
        return true;
    }
}
