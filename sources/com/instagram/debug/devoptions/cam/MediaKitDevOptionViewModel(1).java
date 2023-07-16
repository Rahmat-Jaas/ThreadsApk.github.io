package com.instagram.debug.devoptions.cam;

import X.AnonymousClass0ZV;
import X.AnonymousClass3J5;
import X.AnonymousClass4WJ;
import X.AnonymousClass8bP;
import X.C04220Ms;
import X.C111686o9;
import X.C146958n9;
import X.C147138nS;
import X.C148838sG;
import X.C18180wK;
import X.C18190wL;
import X.C18230wP;
import X.C25237DiI;
import X.C27457Enn;
import X.C27952Ew2;
import X.C62793ak;
import X.C86074wE;
import X.C86094wG;
import X.C86154wM;
import X.DC1;
import X.DIV;
import com.instagram.mediakit.api.MediaKitApi;
import com.instagram.service.session.UserSession;
import java.util.List;
import java.util.Map;

public final class MediaKitDevOptionViewModel extends C62793ak {
    public static final int $stable = 8;
    public final C86074wE _loadingInfoState;
    public final C86074wE _loadingListState;
    public final C86074wE _mediaKitJsonFlow;
    public final C86074wE _mediaKitListFlow;
    public final C86094wG loadingInfoState;
    public final C86094wG loadingListState;
    public final MediaKitApi mediaKitApi;
    public final C86094wG mediaKitJsonFlow;
    public final C86094wG mediaKitListFlow;

    public MediaKitDevOptionViewModel(MediaKitApi mediaKitApi2) {
        C04220Ms.A0B(mediaKitApi2, 1);
        this.mediaKitApi = mediaKitApi2;
        C27457Enn A0z = C18190wL.A0z(true);
        this._loadingListState = A0z;
        this.loadingListState = C18230wP.A0x((C148838sG) null, A0z);
        C27457Enn A0z2 = C18190wL.A0z(true);
        this._loadingInfoState = A0z2;
        this.loadingInfoState = C18230wP.A0x((C148838sG) null, A0z2);
        C27457Enn A0z3 = C18190wL.A0z(AnonymousClass0ZV.A00);
        this._mediaKitListFlow = A0z3;
        this.mediaKitListFlow = C18230wP.A0x((C148838sG) null, A0z3);
        C27457Enn A0z4 = C18190wL.A0z(DIV.A01);
        this._mediaKitJsonFlow = A0z4;
        this.mediaKitJsonFlow = C18230wP.A0x((C148838sG) null, A0z4);
        fetchMediaKitList();
    }

    public final void deleteMediaKitById(String str) {
        C04220Ms.A0B(str, 0);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new MediaKitDevOptionViewModel$deleteMediaKitById$1(this, str, (C146958n9) null), AnonymousClass3J5.A00(this), 3);
    }

    public final void duplicateMediaKit(String str) {
        C04220Ms.A0B(str, 0);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new MediaKitDevOptionViewModel$duplicateMediaKit$1(this, str, (C146958n9) null), C86154wM.A17(this, C18180wK.A0Y(), this._loadingInfoState), 3);
    }

    public final class Factory implements C147138nS {
        public static final int $stable = 8;
        public final UserSession userSession;

        public Factory(UserSession userSession2) {
            C04220Ms.A0B(userSession2, 1);
            this.userSession = userSession2;
        }

        public /* synthetic */ C62793ak create(Class cls, C111686o9 r3) {
            return C147138nS.A00(this, cls);
        }

        public C62793ak create(Class cls) {
            UserSession userSession2 = this.userSession;
            return new MediaKitDevOptionViewModel(new MediaKitApi(DC1.A00(userSession2), userSession2));
        }
    }

    public final void closeMediaKitInfo() {
        this._mediaKitJsonFlow.CrC((Object) null);
    }

    public final C86094wG getLoadingInfoState() {
        return this.loadingInfoState;
    }

    public final C86094wG getLoadingListState() {
        return this.loadingListState;
    }

    public final C86094wG getMediaKitJsonFlow() {
        return this.mediaKitJsonFlow;
    }

    public final C86094wG getMediaKitListFlow() {
        return this.mediaKitListFlow;
    }

    public final void updateMediaKitJson(String str) {
        if (str != null) {
            C86074wE.A01(this._loadingInfoState, true);
            List A0f = AnonymousClass8bP.A0f(str, new String[]{MediaKitDevOptionViewModelKt.TOKEN_SEPARATOR}, 0, 6);
            if (A0f.size() >= 2) {
                Map A0G = AnonymousClass4WJ.A0G(C18180wK.A0p("summary", A0f.get(0)), C18180wK.A0p("sections", A0f.get(1)));
                C25237DiI.A00((Integer) null, (C27952Ew2) null, new MediaKitDevOptionViewModel$updateMediaKitJson$1(this, A0G, (C146958n9) null), AnonymousClass3J5.A00(this), 3);
            }
        }
    }

    /* access modifiers changed from: private */
    public final void fetchMediaKitList() {
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new MediaKitDevOptionViewModel$fetchMediaKitList$1(this, (C146958n9) null), AnonymousClass3J5.A00(this), 3);
    }

    public final void fetchMediaKitInfo(String str) {
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new MediaKitDevOptionViewModel$fetchMediaKitInfo$1(str, this, (C146958n9) null), AnonymousClass3J5.A00(this), 3);
    }
}
