package com.instagram.barcelona.profile.data;

import X.AnonymousClass0OU;
import X.AnonymousClass0YY;
import X.C146958n9;
import X.C39142Kno;
import X.C86164wN;
import X.D0E;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.barcelona.profile.data.ProfileFeedDataSource$refreshFirstPage$2", f = "ProfileFeedDataSource.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
public final class ProfileFeedDataSource$refreshFirstPage$2 extends C39142Kno implements AnonymousClass0YY {
    public int A00;
    public final /* synthetic */ ProfileFeedDataSource A01;
    public final /* synthetic */ boolean A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProfileFeedDataSource$refreshFirstPage$2(ProfileFeedDataSource profileFeedDataSource, C146958n9 r3, boolean z) {
        super(1, r3);
        this.A01 = profileFeedDataSource;
        this.A02 = z;
    }

    public final C146958n9 create(C146958n9 r4) {
        return new ProfileFeedDataSource$refreshFirstPage$2(this.A01, r4, this.A02);
    }

    public final Object invokeSuspend(Object obj) {
        D0E d0e = D0E.COROUTINE_SUSPENDED;
        if (this.A00 != 0) {
            AnonymousClass0OU.A00(obj);
        } else {
            AnonymousClass0OU.A00(obj);
            ProfileFeedDataSource profileFeedDataSource = this.A01;
            boolean z = this.A02;
            this.A00 = 1;
            if (ProfileFeedDataSource.A01(profileFeedDataSource, this, z) == d0e) {
                return d0e;
            }
        }
        return Unit.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((ProfileFeedDataSource$refreshFirstPage$2) C86164wN.A0m(obj, this)).invokeSuspend(Unit.A00);
    }
}
