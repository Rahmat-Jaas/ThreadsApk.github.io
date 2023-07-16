package kotlin.coroutines.jvm.internal;

import X.AnonymousClass0YP;
import X.AnonymousClass0YY;
import X.AnonymousClass0ZU;
import X.AnonymousClass32X;
import X.AnonymousClass3DQ;
import X.AnonymousClass3I2;
import X.AnonymousClass75b;
import X.AnonymousClass784;
import X.AnonymousClass8cU;
import X.BKU;
import X.C106456f4;
import X.C111016me;
import X.C111046mh;
import X.C113756s5;
import X.C11630kW;
import X.C146958n9;
import X.C147818py;
import X.C19052Apr;
import X.C25515Dn3;
import X.C27236EjA;
import X.C30378GBb;
import X.C41253M5p;
import X.C568338s;
import X.C83224qz;
import X.C86104wH;
import X.D2O;
import X.M11;
import androidx.compose.foundation.gestures.DragLogic;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.lazy.AwaitFirstLayoutModifier;
import androidx.compose.foundation.pager.AwaitLazyListStateSet;
import androidx.compose.runtime.PausableMonotonicFrameClock;
import androidx.paging.FlattenedPageController;
import androidx.paging.PageFetcher;
import androidx.paging.PagingSource;
import androidx.paging.SimpleProducerScopeImpl;
import ch.boye.httpclientandroidlib.client.utils.Rfc3492Idn;
import ch.boye.httpclientandroidlib.util.LangUtils;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2;
import com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerBase;
import com.facebook.quickpromotion.sdk.controllers.QPSdkOnDemandSurfaceController;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.redex.IDxFCollectorShape230S0100000_2_I2;
import com.facebook.redex.IDxFCollectorShape59S0300000_1_I2;
import com.facebook.redex.IDxFCollectorShape60S0300000_2_I2;
import com.facebook.redex.IDxFCollectorShape83S0200000_1_I2;
import com.facebook.redex.IDxFCollectorShape84S0200000_2_I2;
import com.facebookpay.addresstypeahead.controller.AddressTypeaheadController;
import com.instagram.appreciation.giftfeed.repository.AppreciationGiftFeedRepository;
import com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService;
import com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService$getSearchResults$$inlined$map$1$2;
import com.instagram.ar.core.effectcollection.EffectCollectionService;
import com.instagram.barcelona.bds.components.header.EnterAlwaysState;
import com.instagram.barcelona.feed.post.data.PostRepository;
import com.instagram.barcelona.linkpreview.api.LinkFetchUtil;
import com.instagram.barcelona.mainactivity.BarcelonaActivity;
import com.instagram.barcelona.profile.followinggraph.data.FollowingGraphRepository;
import com.instagram.barcelona.search.SearchScreenViewModel;
import com.instagram.barcelona.share.data.PermalinkRepository;
import com.instagram.camera.effect.mq.effectmetadata.EffectTrayService;
import com.instagram.camera.effect.mq.effectmetadata.EffectsByIdMetadataService;
import com.instagram.casper.IgSignalsCasper;
import com.instagram.clips.drafts.migrators.ClipsDraftMigrator;
import com.instagram.clips.drafts.model.ClipsDraftPreviewItemRepository;
import com.instagram.clips.drafts.model.ClipsImportDraftRepository;
import com.instagram.clips.drafts.model.datasource.ClipsDraftLocalDataSource;
import com.instagram.clips.drafts.model.disk.DraftDirectoryDiskCleanupJob;
import com.instagram.clips.drafts.model.disk.PanaVideoSourceVideoDiskCleanupJob;
import com.instagram.clips.midcard.perf.ClipsAutoCreatedReelsMediaFetcher;
import com.instagram.debug.devoptions.debughead.linechart.LineChartAxesView;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.service.session.UserSession;
import go.Seq;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class KtCImplShape0S0401000_I2 extends C27236EjA {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    public final Object invokeSuspend(Object obj) {
        switch (this.A05) {
            case 0:
                return ((DragLogic) C86104wH.A0i(obj, this)).A02((C83224qz) null, this);
            case 1:
                this.A04 = obj;
                this.A00 |= Process.WAIT_RESULT_TIMEOUT;
                return ForEachGestureKt.A02((C147818py) null, this, (AnonymousClass0YP) null);
            case 2:
                return ((AwaitFirstLayoutModifier) C86104wH.A0i(obj, this)).A00(this);
            case 3:
                return ((AwaitLazyListStateSet) C86104wH.A0i(obj, this)).A00(this);
            case 4:
                return ((PausableMonotonicFrameClock) C86104wH.A0i(obj, this)).DBB(this, (AnonymousClass0YY) null);
            case 5:
                return ((IDxFCollectorShape83S0200000_1_I2) C86104wH.A0i(obj, this)).A00((AnonymousClass3I2) null, this);
            case 6:
                return ((IDxFCollectorShape230S0100000_2_I2) C86104wH.A0i(obj, this)).A05((AnonymousClass3I2) null, this);
            case 7:
                return ((FlattenedPageController) C86104wH.A0i(obj, this)).A01(this);
            case 8:
            case LangUtils.HASH_SEED /*17*/:
                return ((IDxFCollectorShape60S0300000_2_I2) C86104wH.A0i(obj, this)).emit((Object) null, this);
            case 9:
                return ((IDxFCollectorShape59S0300000_1_I2) C86104wH.A0i(obj, this)).emit((Object) null, this);
            case 10:
                return PageFetcher.A00((PageFetcher) C86104wH.A0i(obj, this), (PagingSource) null, this);
            case 11:
                return ((SimpleProducerScopeImpl) C86104wH.A0i(obj, this)).AA3(this, (AnonymousClass0ZU) null);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return InAppPurchaseControllerBase.A01((InAppPurchaseControllerBase) C86104wH.A0i(obj, this), (String) null, (String) null, this);
            case 13:
                return ((QPSdkOnDemandSurfaceController) C86104wH.A0i(obj, this)).A03((AnonymousClass3DQ) null, (AnonymousClass32X) null, (C568338s) null, (Object) null, (Set) null, this);
            case 14:
                return AddressTypeaheadController.A00((AddressTypeaheadController) C86104wH.A0i(obj, this), (String) null, (String) null, this);
            case 15:
                return ((AppreciationGiftFeedRepository) C86104wH.A0i(obj, this)).A01((Long) null, (String) null, this, false);
            case 16:
                return ((AppreciationGiftFeedRepository) C86104wH.A0i(obj, this)).A02((String) null, this);
            case 18:
                return MiniGalleryService.A01((C111016me) null, (MiniGalleryService) C86104wH.A0i(obj, this), (C113756s5) null, this);
            case 19:
                return ((MiniGalleryService$getSearchResults$$inlined$map$1$2) C86104wH.A0i(obj, this)).emit((Object) null, this);
            case 20:
                return EffectCollectionService.A01((EffectCollectionService) C86104wH.A0i(obj, this), (AnonymousClass784) null, (C25515Dn3) null, (C113756s5) null, (String) null, this, false);
            case 21:
            case 32:
                return ((IDxFCollectorShape84S0200000_2_I2) C86104wH.A0i(obj, this)).emit((Object) null, this);
            case 22:
                return C41253M5p.A01((C41253M5p) C86104wH.A0i(obj, this), (C30378GBb) null, this);
            case 23:
                return ((EnterAlwaysState) C86104wH.A0i(obj, this)).A02((AnonymousClass8cU) null, this, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            case 24:
                return M11.A00((M11) C86104wH.A0i(obj, this), (Collection) null, this);
            case 25:
                return ((PostRepository) C86104wH.A0i(obj, this)).A02((String) null, this);
            case Rfc3492Idn.tmax /*26*/:
                return PostRepository.A00((PostRepository) C86104wH.A0i(obj, this), (String) null, this, false);
            case 27:
                return ((PostRepository) C86104wH.A0i(obj, this)).A03((String) null, this);
            case 28:
                return LinkFetchUtil.A00((LinkFetchUtil) C86104wH.A0i(obj, this), (UserSession) null, (String) null, this, (AnonymousClass0YY) null);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
                return BarcelonaActivity.A00((KtCSuperShape0S2100000_I2) null, (AnonymousClass75b) null, (BarcelonaActivity) C86104wH.A0i(obj, this), this);
            case 30:
                return BarcelonaActivity.A01((KtCSuperShape0S2100000_I2) null, (AnonymousClass75b) null, (BarcelonaActivity) C86104wH.A0i(obj, this), this);
            case 31:
                return BarcelonaActivity.A02((KtCSuperShape0S2100000_I2) null, (AnonymousClass75b) null, (BarcelonaActivity) C86104wH.A0i(obj, this), this);
            case 33:
                return ((FollowingGraphRepository) C86104wH.A0i(obj, this)).A02((String) null, this);
            case 34:
                return ((IDxFCollectorShape230S0100000_2_I2) C86104wH.A0i(obj, this)).A03((C106456f4) null, this);
            case 35:
                return SearchScreenViewModel.A01((SearchScreenViewModel) C86104wH.A0i(obj, this), (String) null, this);
            case Rfc3492Idn.base /*36*/:
                return ((PermalinkRepository) C86104wH.A0i(obj, this)).A01((C11630kW) null, (BKU) null, this);
            case LangUtils.HASH_OFFSET /*37*/:
                return EffectTrayService.A02((C111046mh) null, (EffectTrayService) C86104wH.A0i(obj, this), this);
            case Rfc3492Idn.skew /*38*/:
                return EffectsByIdMetadataService.A00((C111046mh) null, (EffectsByIdMetadataService) C86104wH.A0i(obj, this), this);
            case 39:
                return IgSignalsCasper.A03((IgSignalsCasper) C86104wH.A0i(obj, this), this);
            case LineChartAxesView.AXIS_TICK_OFFSET /*40*/:
                return IgSignalsCasper.A04((IgSignalsCasper) C86104wH.A0i(obj, this), this);
            case Seq.NULL_REFNUM /*41*/:
                return ClipsDraftMigrator.A00((ClipsDraftMigrator) C86104wH.A0i(obj, this), this);
            case Seq.RefTracker.REF_OFFSET /*42*/:
                return ((ClipsDraftPreviewItemRepository) C86104wH.A0i(obj, this)).A01((List) null, this);
            case 43:
                return ClipsImportDraftRepository.A00((ClipsImportDraftRepository) C86104wH.A0i(obj, this), (C19052Apr) null, (String) null, (String) null, (List) null, this, (AnonymousClass0ZU) null);
            case 44:
                return ((ClipsDraftLocalDataSource) C86104wH.A0i(obj, this)).A09((String) null, this);
            case 45:
                return ((ClipsDraftLocalDataSource) C86104wH.A0i(obj, this)).A04((D2O) null, this);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN:
                return ((ClipsDraftLocalDataSource) C86104wH.A0i(obj, this)).A06((String) null, (String) null, this);
            case 47:
                return ((DraftDirectoryDiskCleanupJob) C86104wH.A0i(obj, this)).CfO((UserSession) null, this);
            case 48:
                return ((PanaVideoSourceVideoDiskCleanupJob) C86104wH.A0i(obj, this)).CfO((UserSession) null, this);
            default:
                return ClipsAutoCreatedReelsMediaFetcher.A01((ClipsAutoCreatedReelsMediaFetcher) C86104wH.A0i(obj, this), (String) null, (List) null, this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtCImplShape0S0401000_I2(Object obj, C146958n9 r2, int i) {
        super(r2);
        this.A05 = i;
        this.A04 = obj;
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof KtCImplShape0S0401000_I2) || ((KtCImplShape0S0401000_I2) obj).A05 != i) {
            return false;
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtCImplShape0S0401000_I2(C146958n9 r2) {
        super(r2);
        this.A05 = 1;
    }
}
