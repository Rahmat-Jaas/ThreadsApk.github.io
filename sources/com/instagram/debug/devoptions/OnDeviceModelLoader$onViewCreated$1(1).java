package com.instagram.debug.devoptions;

import X.AnonymousClass0OU;
import X.AnonymousClass0YP;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C14030oh;
import X.C146958n9;
import X.C25237DiI;
import X.C27952Ew2;
import X.C39142Kno;
import X.C83224qz;
import android.view.View;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.common.ui.base.IgTextView;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

public final class OnDeviceModelLoader$onViewCreated$1 implements View.OnClickListener {
    public final /* synthetic */ OnDeviceModelLoader this$0;

    @DebugMetadata(c = "com.instagram.debug.devoptions.OnDeviceModelLoader$onViewCreated$1$1", f = "OnDeviceModelLoader.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.instagram.debug.devoptions.OnDeviceModelLoader$onViewCreated$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C39142Kno implements AnonymousClass0YP {
        public int label;

        public final C146958n9 create(Object obj, C146958n9 r4) {
            return new AnonymousClass1(r4);
        }

        public final Object invoke(C83224qz r3, C146958n9 r4) {
            return new AnonymousClass1(r4).invokeSuspend(Unit.A00);
        }

        public final Object invokeSuspend(Object obj) {
            String str;
            if (this.label == 0) {
                AnonymousClass0OU.A00(obj);
                OnDeviceModelLoader onDeviceModelLoader = OnDeviceModelLoader.this;
                IgEditText igEditText = onDeviceModelLoader.modelInput;
                if (igEditText == null) {
                    str = "modelInput";
                } else {
                    String A0n = AnonymousClass0wJ.A0n(igEditText);
                    IgEditText igEditText2 = OnDeviceModelLoader.this.assetInput;
                    if (igEditText2 == null) {
                        str = "assetInput";
                    } else {
                        String A0n2 = AnonymousClass0wJ.A0n(igEditText2);
                        IgEditText igEditText3 = OnDeviceModelLoader.this.versionInput;
                        if (igEditText3 == null) {
                            str = "versionInput";
                        } else {
                            onDeviceModelLoader.fetchModel(A0n, A0n2, Long.parseLong(AnonymousClass0wJ.A0n(igEditText3)));
                            return Unit.A00;
                        }
                    }
                }
                C04220Ms.A0E(str);
                throw null;
            }
            throw AnonymousClass0wJ.A0a();
        }
    }

    public OnDeviceModelLoader$onViewCreated$1(OnDeviceModelLoader onDeviceModelLoader) {
        this.this$0 = onDeviceModelLoader;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-187677896);
        IgTextView igTextView = this.this$0.resultView;
        if (igTextView == null) {
            C04220Ms.A0E("resultView");
            throw null;
        }
        igTextView.setText("");
        final OnDeviceModelLoader onDeviceModelLoader = this.this$0;
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new AnonymousClass1((C146958n9) null), onDeviceModelLoader.coroutineScope, 3);
        C14030oh.A0C(-1123950712, A05);
    }
}
