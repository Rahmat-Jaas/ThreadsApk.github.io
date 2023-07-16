package com.instagram.debug.devoptions.cam;

import X.AnonymousClass061;
import X.AnonymousClass0OU;
import X.AnonymousClass0YP;
import X.AnonymousClass0wJ;
import X.AnonymousClass3J4;
import X.C146958n9;
import X.C18230wP;
import X.C39142Kno;
import X.C83224qz;
import X.C84714tk;
import X.D0E;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.debug.devoptions.cam.CamDevOptionsFragment$onCreate$1", f = "CamDevOptionsFragment.kt", i = {}, l = {49}, m = "invokeSuspend", n = {}, s = {})
public final class CamDevOptionsFragment$onCreate$1 extends C39142Kno implements AnonymousClass0YP {
    public int label;
    public final /* synthetic */ CamDevOptionsFragment this$0;

    @DebugMetadata(c = "com.instagram.debug.devoptions.cam.CamDevOptionsFragment$onCreate$1$1", f = "CamDevOptionsFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.instagram.debug.devoptions.cam.CamDevOptionsFragment$onCreate$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C39142Kno implements AnonymousClass0YP {
        public /* synthetic */ Object L$0;
        public int label;

        public final C146958n9 create(Object obj, C146958n9 r4) {
            AnonymousClass1 r0 = new AnonymousClass1(r4);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(C83224qz r3, C146958n9 r4) {
            return ((AnonymousClass1) create(r3, r4)).invokeSuspend(Unit.A00);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                AnonymousClass0OU.A00(obj);
                C83224qz r4 = (C83224qz) this.L$0;
                C84714tk r2 = CamDevOptionsFragment.this.getCamDevOptionsViewModel().eventFlow;
                final CamDevOptionsFragment camDevOptionsFragment = CamDevOptionsFragment.this;
                C18230wP.A1T(new AnonymousClass0YP((C146958n9) null) {
                    public /* synthetic */ Object L$0;
                    public int label;

                    public final C146958n9 create(Object obj, C146958n9 r4) {
                        AnonymousClass1 r0 = 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        public CamDevOptionsFragment$onCreate$1(CamDevOptionsFragment camDevOptionsFragment, C146958n9 r3) {
                            super(2, r3);
                            this.this$0 = camDevOptionsFragment;
                        }

                        public final C146958n9 create(Object obj, C146958n9 r4) {
                            return new CamDevOptionsFragment$onCreate$1(this.this$0, r4);
                        }

                        public final Object invoke(C83224qz r3, C146958n9 r4) {
                            return new CamDevOptionsFragment$onCreate$1(this.this$0, r4).invokeSuspend(Unit.A00);
                        }

                        public final Object invokeSuspend(Object obj) {
                            D0E d0e = D0E.COROUTINE_SUSPENDED;
                            int i = this.label;
                            if (i == 0) {
                                AnonymousClass0OU.A00(obj);
                                final CamDevOptionsFragment camDevOptionsFragment = this.this$0;
                                AnonymousClass061 r2 = AnonymousClass061.STARTED;
                                AnonymousClass1 r0 = new AnonymousClass1((C146958n9) null);
                                this.label = 1;
                                if (AnonymousClass3J4.A01(r2, camDevOptionsFragment, this, r0) == d0e) {
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
