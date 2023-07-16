package com.instagram.debug.devoptions.cam;

import X.AnonymousClass00U;
import X.AnonymousClass0OU;
import X.AnonymousClass0YP;
import X.AnonymousClass0wJ;
import X.AnonymousClass3NI;
import X.AnonymousClass420;
import X.AnonymousClass5z1;
import X.AnonymousClass5z2;
import X.AnonymousClass6TD;
import X.C04220Ms;
import X.C100976Pk;
import X.C109436k0;
import X.C112176p7;
import X.C146958n9;
import X.C18220wO;
import X.C39142Kno;
import X.C83224qz;
import X.C83234r0;
import X.C84714tk;
import X.C86074wE;
import X.C89865Hh;
import X.D0E;
import com.instagram.mediakit.model.MediaKitVisibility;
import com.instagram.user.model.User;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.debug.devoptions.cam.MediaKitDevOptionViewModel$duplicateMediaKit$1", f = "MediaKitDevOptionViewModel.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {})
public final class MediaKitDevOptionViewModel$duplicateMediaKit$1 extends C39142Kno implements AnonymousClass0YP {
    public final /* synthetic */ String $mediaKitId;
    public int label;
    public final /* synthetic */ MediaKitDevOptionViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaKitDevOptionViewModel$duplicateMediaKit$1(MediaKitDevOptionViewModel mediaKitDevOptionViewModel, String str, C146958n9 r4) {
        super(2, r4);
        this.this$0 = mediaKitDevOptionViewModel;
        this.$mediaKitId = str;
    }

    public final C146958n9 create(Object obj, C146958n9 r5) {
        return new MediaKitDevOptionViewModel$duplicateMediaKit$1(this.this$0, this.$mediaKitId, r5);
    }

    public final Object invoke(C83224qz r3, C146958n9 r4) {
        return ((MediaKitDevOptionViewModel$duplicateMediaKit$1) create(r3, r4)).invokeSuspend(Unit.A00);
    }

    public final Object invokeSuspend(Object obj) {
        D0E d0e = D0E.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0OU.A00(obj);
            C84714tk A07 = this.this$0.mediaKitApi.A07(this.$mediaKitId);
            final MediaKitDevOptionViewModel mediaKitDevOptionViewModel = this.this$0;
            AnonymousClass1 r0 = new C83234r0() {
                public final Object emit(C100976Pk r14, C146958n9 r15) {
                    C86074wE.A01(MediaKitDevOptionViewModel.this._loadingListState, !(r14 instanceof AnonymousClass5z1));
                    if (r14 instanceof AnonymousClass5z2) {
                        C109436k0 r1 = (C109436k0) ((AnonymousClass5z2) r14).A00;
                        C89865Hh r0 = r1.A00;
                        String str = r1.A01;
                        List list = r1.A02;
                        List list2 = r0.A06;
                        String str2 = r0.A02;
                        boolean z = r0.A07;
                        User user = r0.A01;
                        String str3 = r0.A04;
                        String str4 = r0.A05;
                        MediaKitVisibility mediaKitVisibility = r0.A00;
                        String A0L = AnonymousClass00U.A0L("Copy of ", str4);
                        C04220Ms.A0B(A0L, 0);
                        new C112176p7(new AnonymousClass420());
                        C109436k0 A00 = AnonymousClass3NI.A00(new C89865Hh(mediaKitVisibility, user, str2, (String) null, str3, A0L, list2, z), str, list);
                        Object collect = MediaKitDevOptionViewModel.this.mediaKitApi.A08(AnonymousClass6TD.A00(A00), C18220wO.A1U(A00.A00.A03)).collect(new MediaKitDevOptionViewModel$duplicateMediaKit$1$1$emit$2(MediaKitDevOptionViewModel.this, r14), r15);
                        if (collect == D0E.COROUTINE_SUSPENDED) {
                            return collect;
                        }
                    }
                    return Unit.A00;
                }
            };
            this.label = 1;
            if (A07.collect(r0, this) == d0e) {
                return d0e;
            }
        } else if (i == 1) {
            AnonymousClass0OU.A00(obj);
        } else {
            throw AnonymousClass0wJ.A0a();
        }
        return Unit.A00;
    }
}
