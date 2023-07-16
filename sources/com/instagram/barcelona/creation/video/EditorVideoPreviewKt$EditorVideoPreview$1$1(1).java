package com.instagram.barcelona.creation.video;

import X.AnonymousClass0OU;
import X.AnonymousClass0YP;
import X.C04220Ms;
import X.C105506dX;
import X.C146958n9;
import X.C147368pE;
import X.C18220wO;
import X.C25295DjG;
import X.C25599DoZ;
import X.C27219EgD;
import X.C39142Kno;
import X.C954260r;
import X.D0E;
import android.media.MediaMetadataRetriever;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.KtSLambdaShape3S1100000_I2;

@DebugMetadata(c = "com.instagram.barcelona.creation.video.EditorVideoPreviewKt$EditorVideoPreview$1$1", f = "EditorVideoPreview.kt", i = {}, l = {48}, m = "invokeSuspend", n = {}, s = {})
public final class EditorVideoPreviewKt$EditorVideoPreview$1$1 extends C39142Kno implements AnonymousClass0YP {
    public int A00;
    public Object A01;
    public final /* synthetic */ C147368pE A02;
    public final /* synthetic */ C105506dX A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditorVideoPreviewKt$EditorVideoPreview$1$1(C147368pE r2, C105506dX r3, String str, C146958n9 r5, boolean z, boolean z2) {
        super(2, r5);
        this.A03 = r3;
        this.A04 = str;
        this.A06 = z;
        this.A05 = z2;
        this.A02 = r2;
    }

    public final C146958n9 create(Object obj, C146958n9 r9) {
        return new EditorVideoPreviewKt$EditorVideoPreview$1$1(this.A02, this.A03, this.A04, r9, this.A06, this.A05);
    }

    public final Object invokeSuspend(Object obj) {
        C147368pE r8;
        D0E d0e = D0E.COROUTINE_SUSPENDED;
        if (this.A00 != 0) {
            r8 = (C147368pE) this.A01;
            AnonymousClass0OU.A00(obj);
        } else {
            AnonymousClass0OU.A00(obj);
            C105506dX r4 = this.A03;
            String str = this.A04;
            boolean z = this.A06;
            boolean z2 = this.A05;
            C04220Ms.A0B(str, 0);
            r4.A00.setVideoPath(str, new C954260r(r4, z2, z));
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            r8 = this.A02;
            C27219EgD egD = C25295DjG.A01;
            KtSLambdaShape3S1100000_I2 ktSLambdaShape3S1100000_I2 = new KtSLambdaShape3S1100000_I2(mediaMetadataRetriever, str, (C146958n9) null, 2);
            this.A01 = r8;
            this.A00 = 1;
            obj = C25599DoZ.A00(this, egD, ktSLambdaShape3S1100000_I2);
            if (obj == d0e) {
                return d0e;
            }
        }
        r8.CrC(obj);
        return Unit.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((EditorVideoPreviewKt$EditorVideoPreview$1$1) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
    }
}
