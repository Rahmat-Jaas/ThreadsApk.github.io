package com.instagram.debug.devoptions.dcp;

import X.AnonymousClass0OU;
import X.AnonymousClass0YP;
import X.AnonymousClass0wJ;
import X.C03700Kj;
import X.C04220Ms;
import X.C146958n9;
import X.C18180wK;
import X.C18190wL;
import X.C25599DoZ;
import X.C27219EgD;
import X.C39142Kno;
import X.C83224qz;
import X.D0E;
import X.E5N;
import android.widget.TextView;
import com.facebook.dcp.signals.persistence.roomimpl.ig4a.RoomSignalsDatabase;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.debug.devoptions.dcp.SignalStoreTestFragment$testRoomDbSave$1", f = "SignalStoreTestFragment.kt", i = {}, l = {143}, m = "invokeSuspend", n = {}, s = {})
public final class SignalStoreTestFragment$testRoomDbSave$1 extends C39142Kno implements AnonymousClass0YP {
    public final /* synthetic */ C03700Kj $clock;
    public final /* synthetic */ RoomSignalsDatabase $db;
    public final /* synthetic */ List $entities;
    public final /* synthetic */ int $numEntries;
    public int label;
    public final /* synthetic */ SignalStoreTestFragment this$0;

    @DebugMetadata(c = "com.instagram.debug.devoptions.dcp.SignalStoreTestFragment$testRoomDbSave$1$1", f = "SignalStoreTestFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.instagram.debug.devoptions.dcp.SignalStoreTestFragment$testRoomDbSave$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C39142Kno implements AnonymousClass0YP {
        public int label;

        public final C146958n9 create(Object obj, C146958n9 r5) {
            return new AnonymousClass1(A0i, r5);
        }

        public final Object invoke(C83224qz r3, C146958n9 r4) {
            return ((AnonymousClass1) create(r3, r4)).invokeSuspend(Unit.A00);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                AnonymousClass0OU.A00(obj);
                TextView textView = SignalStoreTestFragment.this.responseText;
                if (textView == null) {
                    C04220Ms.A0E("responseText");
                    throw null;
                }
                textView.setText(A0i);
                return Unit.A00;
            }
            throw AnonymousClass0wJ.A0a();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SignalStoreTestFragment$testRoomDbSave$1(C03700Kj r2, RoomSignalsDatabase roomSignalsDatabase, List list, int i, SignalStoreTestFragment signalStoreTestFragment, C146958n9 r7) {
        super(2, r7);
        this.$clock = r2;
        this.$db = roomSignalsDatabase;
        this.$entities = list;
        this.$numEntries = i;
        this.this$0 = signalStoreTestFragment;
    }

    public final C146958n9 create(Object obj, C146958n9 r9) {
        return new SignalStoreTestFragment$testRoomDbSave$1(this.$clock, this.$db, this.$entities, this.$numEntries, this.this$0, r9);
    }

    public final Object invoke(C83224qz r3, C146958n9 r4) {
        return ((SignalStoreTestFragment$testRoomDbSave$1) create(r3, r4)).invokeSuspend(Unit.A00);
    }

    public final Object invokeSuspend(Object obj) {
        D0E d0e = D0E.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0OU.A00(obj);
            long currentTimeMillis = System.currentTimeMillis();
            this.$db.A00().A03(this.$entities);
            long currentTimeMillis2 = System.currentTimeMillis();
            StringBuilder A0s = C18190wL.A0s("Saving ");
            A0s.append(this.$numEntries);
            A0s.append(" entries: ");
            A0s.append(currentTimeMillis2 - currentTimeMillis);
            final String A0i = C18180wK.A0i(" ms", A0s);
            final SignalStoreTestFragment signalStoreTestFragment = this.this$0;
            C27219EgD egD = ((E5N) signalStoreTestFragment.dispatcherProvider).A03;
            AnonymousClass1 r0 = new AnonymousClass1((C146958n9) null);
            this.label = 1;
            if (C25599DoZ.A00(this, egD, r0) == d0e) {
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
