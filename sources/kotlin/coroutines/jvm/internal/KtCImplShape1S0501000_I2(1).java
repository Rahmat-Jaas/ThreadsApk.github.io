package kotlin.coroutines.jvm.internal;

import X.AnonymousClass0YP;
import X.AnonymousClass0YY;
import X.AnonymousClass3I2;
import X.AnonymousClass7WW;
import X.BB8;
import X.BKU;
import X.C10300i6;
import X.C109216je;
import X.C113016qZ;
import X.C113756s5;
import X.C146448mG;
import X.C146958n9;
import X.C147828pz;
import X.C148838sG;
import X.C170779vY;
import X.C23908D0w;
import X.C25546Dne;
import X.C25633DpA;
import X.C25646DpQ;
import X.C25758DrV;
import X.C26743EUq;
import X.C27236EjA;
import X.C27810Etf;
import X.C30378GBb;
import X.C30441GDr;
import X.C30788GVb;
import X.C30936GbS;
import X.C30945Gbg;
import X.C33857Hvq;
import X.C41253M5p;
import X.C83224qz;
import X.C86104wH;
import X.C873552g;
import X.C967166k;
import X.CL7;
import X.D2O;
import X.EAW;
import X.G4C;
import android.content.Context;
import android.os.Bundle;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.DragLogic;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.paging.FlattenedPageController;
import androidx.paging.PageFetcherSnapshot;
import androidx.paging.SingleRunner;
import ch.boye.httpclientandroidlib.client.utils.Rfc3492Idn;
import ch.boye.httpclientandroidlib.util.LangUtils;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1101000_I2;
import com.facebook.videolite.instagram.SuspendableVideoIngestionStep;
import com.instagram.ar.core.effectcollection.EffectCollectionService;
import com.instagram.barcelona.feed.data.BarcelonaFeedCache;
import com.instagram.brandedcontent.ads.repository.BCAApprovePostsForPromotionRepository;
import com.instagram.brandedcontent.ui.BrandedContentFeedDisclosureController;
import com.instagram.camera.effect.mq.effectmetadata.EffectTrayService$withSelectedEffect$$inlined$map$1$2;
import com.instagram.clips.audio.soundsync.repository.ClipsSoundSyncBeatsInfoRepository;
import com.instagram.clips.drafts.model.datasource.ClipsDraftLocalDataSource;
import com.instagram.clips.midcard.perf.ClipsAutoCreatedReelsMediaFetcher;
import com.instagram.comments.mvvm.data.MediaCommentListRepository;
import com.instagram.creation.capture.quickcapture.inspirationhub.network.InspirationHubRepository;
import com.instagram.creation.capture.quickcapture.savedmediametadata.SavedMediaMetadataService;
import com.instagram.creation.capture.quickcapture.sundial.remix.repository.ClipsRemixOriginalMediaRepository;
import com.instagram.creation.capture.quickcapture.sundial.sfx.repository.SfxAudioRepository;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel;
import com.instagram.creation.capture.quickcapture.undo.model.UndoReelMediaEditsViewModel;
import com.instagram.debug.devoptions.debughead.linechart.LineChartAxesView;
import com.instagram.direct.headmojis.effects.HeadmojiEffectRenderer;
import com.instagram.events.data.EventsGraphQLDataSource;
import com.instagram.fanclub.consideration.FanClubConsiderationRepository;
import com.instagram.feed.media.flashmedia.FlashMediaCacheImpl;
import com.instagram.fx.access.sso.FxSsoViewModel;
import com.instagram.groupprofiles.data.GroupProfileRepository;
import com.instagram.igtv.repository.series.IGTVSeriesRepository;
import com.instagram.mediakit.repository.upload.MediaKitUploadApi;
import com.instagram.payout.repository.PayoutOnboardingRepository;
import com.instagram.pendingmedia.model.PendingMedia;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.pendingmedia.service.common.ParsingSyncHttpService;
import com.instagram.pendingmedia.service.impl.PendingMediaWorkManager$WorkQueue;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.service.session.UserSession;
import go.Seq;
import java.util.List;

public class KtCImplShape1S0501000_I2 extends C27236EjA {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final int A06;

    public final Object invokeSuspend(Object obj) {
        switch (this.A06) {
            case 0:
                this.A05 = obj;
                this.A00 |= Process.WAIT_RESULT_TIMEOUT;
                return SuspendAnimationKt.A01((C146448mG) null, (AnonymousClass7WW) null, this, (AnonymousClass0YY) null, 0);
            case 1:
                this.A05 = obj;
                this.A00 |= Process.WAIT_RESULT_TIMEOUT;
                return DragGestureDetectorKt.A03((C147828pz) null, this, (AnonymousClass0YY) null, 0);
            case 2:
                return ((DragLogic) C86104wH.A0k(obj, this)).A01((C873552g) null, this, (C83224qz) null);
            case 3:
                return ((LazyListState) C86104wH.A0k(obj, this)).CgB((C967166k) null, this, (AnonymousClass0YP) null);
            case 4:
                return ((LazyGridState) C86104wH.A0k(obj, this)).CgB((C967166k) null, this, (AnonymousClass0YP) null);
            case 5:
                return ((AndroidComposeViewAccessibilityDelegateCompat) C86104wH.A0k(obj, this)).A0R(this);
            case 6:
                return ((FlattenedPageController) C86104wH.A0k(obj, this)).A00((AnonymousClass3I2) null, this);
            case 7:
                return ((PageFetcherSnapshot) C86104wH.A0k(obj, this)).A09(this);
            case 8:
                return ((SingleRunner.Holder) C86104wH.A0k(obj, this)).A00(this, (C148838sG) null);
            case 9:
                return ((SuspendableVideoIngestionStep) C86104wH.A0k(obj, this)).D7x((C30936GbS) null, this);
            case 10:
                return EffectCollectionService.A03((EffectCollectionService) C86104wH.A0k(obj, this), (C113016qZ) null, this);
            case 11:
                return EffectCollectionService.A06((EffectCollectionService) C86104wH.A0k(obj, this), (C113756s5) null, (C113756s5) null, this);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return ((EffectCollectionService) C86104wH.A0k(obj, this)).A0A((C23908D0w) null, (BB8) null, this);
            case 13:
                return C41253M5p.A03((C41253M5p) C86104wH.A0k(obj, this), (Integer) null, (String) null, this, 0);
            case 14:
                return C41253M5p.A02((C41253M5p) C86104wH.A0k(obj, this), (G4C) null, this, false);
            case 15:
                return C41253M5p.A00((C30441GDr) null, (C41253M5p) C86104wH.A0k(obj, this), (C30378GBb) null, this);
            case 16:
                return ((BarcelonaFeedCache) C86104wH.A0k(obj, this)).A07((List) null, this);
            case LangUtils.HASH_SEED /*17*/:
                return ((BCAApprovePostsForPromotionRepository) C86104wH.A0k(obj, this)).A01((String) null, (String) null, this);
            case 18:
                return ((BCAApprovePostsForPromotionRepository) C86104wH.A0k(obj, this)).A02((String) null, (String) null, this);
            case 19:
                return BrandedContentFeedDisclosureController.A00((BrandedContentFeedDisclosureController) C86104wH.A0k(obj, this), (List) null, this);
            case 20:
                return ((EffectTrayService$withSelectedEffect$$inlined$map$1$2) C86104wH.A0k(obj, this)).emit((Object) null, this);
            case 21:
                return ((ClipsSoundSyncBeatsInfoRepository) C86104wH.A0k(obj, this)).A01((C109216je) null, this);
            case 22:
                return ((ClipsDraftLocalDataSource) C86104wH.A0k(obj, this)).A03((D2O) null, this);
            case 23:
                return ClipsAutoCreatedReelsMediaFetcher.A00((ClipsAutoCreatedReelsMediaFetcher) C86104wH.A0k(obj, this), (String) null, (List) null, this);
            case 24:
                return MediaCommentListRepository.A00((MediaCommentListRepository) C86104wH.A0k(obj, this), this, (AnonymousClass0YY) null);
            case 25:
                return InspirationHubRepository.A00((InspirationHubRepository) C86104wH.A0k(obj, this), (String) null, (List) null, this);
            case Rfc3492Idn.tmax /*26*/:
                return InspirationHubRepository.A01((InspirationHubRepository) C86104wH.A0k(obj, this), (List) null, this);
            case 27:
                return ((SavedMediaMetadataService) C86104wH.A0k(obj, this)).A02((C30945Gbg) null, this);
            case 28:
                return ((ClipsRemixOriginalMediaRepository) C86104wH.A0k(obj, this)).A00((String) null, (String) null, this);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
                return ((SfxAudioRepository) C86104wH.A0k(obj, this)).A00((String) null, this);
            case 30:
                return ClipsCreationDraftViewModel.A06((ClipsCreationDraftViewModel) C86104wH.A0k(obj, this), (D2O) null, (PendingRecipient) null, this);
            case 31:
                return ClipsCreationDraftViewModel.A03((ClipsCreationDraftViewModel) C86104wH.A0k(obj, this), (C27810Etf) null, (C25546Dne) null, this, (AnonymousClass0YY) null, false, false);
            case 32:
                return ((UndoReelMediaEditsViewModel) C86104wH.A0k(obj, this)).A03((String) null, this);
            case 33:
                return HeadmojiEffectRenderer.A05((HeadmojiEffectRenderer) C86104wH.A0k(obj, this), this, 0, 0);
            case 34:
                return C25633DpA.A00((C25633DpA) C86104wH.A0k(obj, this), (List) null, this);
            case 35:
                return C25758DrV.A02((C25758DrV) C86104wH.A0k(obj, this), (C25646DpQ) null, (List) null, this);
            case Rfc3492Idn.base /*36*/:
                return ((EventsGraphQLDataSource) C86104wH.A0k(obj, this)).A00((C26743EUq) null, (Integer) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, this);
            case LangUtils.HASH_OFFSET /*37*/:
                return ((FanClubConsiderationRepository) C86104wH.A0k(obj, this)).A00((Boolean) null, (Boolean) null, (String) null, this);
            case Rfc3492Idn.skew /*38*/:
                return FlashMediaCacheImpl.A03((FlashMediaCacheImpl) C86104wH.A0k(obj, this), (C170779vY) null, (List) null, this);
            case 39:
                return FlashMediaCacheImpl.A05((FlashMediaCacheImpl) C86104wH.A0k(obj, this), this);
            case LineChartAxesView.AXIS_TICK_OFFSET /*40*/:
                return FlashMediaCacheImpl.A00((BKU) null, (FlashMediaCacheImpl) C86104wH.A0k(obj, this), (C170779vY) null, this);
            case Seq.NULL_REFNUM /*41*/:
                return FxSsoViewModel.A00((Context) null, (Bundle) null, (C10300i6) null, (FxSsoViewModel) C86104wH.A0k(obj, this), this);
            case Seq.RefTracker.REF_OFFSET /*42*/:
                return ((GroupProfileRepository) C86104wH.A0k(obj, this)).A03((C26743EUq) null, (String) null, (String) null, (String) null, (String) null, this, false, false, false);
            case 43:
                return ((IGTVSeriesRepository) C86104wH.A0k(obj, this)).A04((String) null, (String) null, this);
            case 44:
                return ((MediaKitUploadApi) C86104wH.A0k(obj, this)).A01((EAW) null, (String) null, this);
            case 45:
                return MediaKitUploadApi.A00((KtCSuperShape0S1101000_I2) null, (MediaKitUploadApi) C86104wH.A0k(obj, this), (EAW) null, this);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN:
                return ((PayoutOnboardingRepository) C86104wH.A0k(obj, this)).A04((String) null, (String) null, this);
            case 47:
                return ((ParsingSyncHttpService) C86104wH.A0k(obj, this)).A01((C30788GVb) null, (C33857Hvq) null, (UserSession) null, this);
            case 48:
                return ((PendingMediaWorkManager$WorkQueue) C86104wH.A0k(obj, this)).A00((PendingMedia) null, this);
            default:
                return ((PendingMediaWorkManager$WorkQueue) C86104wH.A0k(obj, this)).A01((CL7) null, this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtCImplShape1S0501000_I2(Object obj, C146958n9 r2, int i) {
        super(r2);
        this.A06 = i;
        this.A05 = obj;
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof KtCImplShape1S0501000_I2) || ((KtCImplShape1S0501000_I2) obj).A06 != i) {
            return false;
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtCImplShape1S0501000_I2(int i, C146958n9 r2) {
        super(r2);
        this.A06 = i;
    }
}
