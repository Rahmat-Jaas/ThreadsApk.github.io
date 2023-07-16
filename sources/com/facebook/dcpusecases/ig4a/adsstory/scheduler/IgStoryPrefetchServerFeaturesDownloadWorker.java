package com.facebook.dcpusecases.ig4a.adsstory.scheduler;

import X.AnonymousClass000;
import X.AnonymousClass0IY;
import X.AnonymousClass0LU;
import X.AnonymousClass0wJ;
import X.AnonymousClass5Id;
import X.C03700Kj;
import X.C04220Ms;
import X.C1198077b;
import X.C126027eS;
import X.C132317th;
import X.C132387to;
import X.C145798l6;
import X.C147128nR;
import X.C18230wP;
import X.C18240wQ;
import X.C86124wJ;
import X.LCR;
import X.LCS;
import X.Le9;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.facebook.dcp.model.Example;
import com.instagram.service.session.UserSession;
import java.util.List;

public final class IgStoryPrefetchServerFeaturesDownloadWorker extends Worker {
    public C03700Kj A00;
    public C145798l6 A01;
    public C1198077b A02;
    public C147128nR A03;
    public UserSession A04;
    public final Context A05;

    public final Le9 A05() {
        String str;
        Class<IgStoryPrefetchServerFeaturesDownloadWorker> cls = IgStoryPrefetchServerFeaturesDownloadWorker.class;
        try {
            UserSession A0Z = C18230wP.A0Z();
            this.A04 = A0Z;
            this.A00 = AnonymousClass0IY.A00;
            if (A0Z != null) {
                this.A03 = new C126027eS(A0Z);
                UserSession userSession = this.A04;
                if (userSession != null) {
                    Context context = this.A05;
                    C04220Ms.A0B(context, 1);
                    this.A02 = ((C132317th) C86124wJ.A0o(userSession, C132317th.class, context, 35)).A00;
                    UserSession userSession2 = this.A04;
                    if (userSession2 != null) {
                        this.A01 = (C145798l6) ((C132387to) C86124wJ.A0n(userSession2, C132387to.class, 6)).A04.getValue();
                        C1198077b r1 = this.A02;
                        if (r1 == null) {
                            str = "igStoryPrefetchServerFeatureFetcher";
                        } else {
                            C147128nR r0 = this.A03;
                            if (r0 == null) {
                                str = "igStoryPrefetchPredictorConfig";
                            } else {
                                AnonymousClass5Id A002 = C1198077b.A00(r1, r0);
                                if (A002.A02) {
                                    List list = (List) A002.A00;
                                    if (!list.isEmpty()) {
                                        Example example = (Example) C18240wQ.A0b(list);
                                        C145798l6 r3 = this.A01;
                                        if (r3 == null) {
                                            str = "igStoryPrefetchServerFeatureStore";
                                        } else if (this.A00 == null) {
                                            str = "clock";
                                        } else {
                                            r3.CwJ(example, "IG_ADS_PREFETCH", System.currentTimeMillis());
                                            return new LCS();
                                        }
                                    }
                                }
                                return new LCR();
                            }
                        }
                        C04220Ms.A0E(str);
                        throw null;
                    }
                }
            }
            C04220Ms.A0E("userSession");
            throw null;
        } catch (UnsupportedOperationException e) {
            String message = e.getMessage();
            if (message == null) {
                message = AnonymousClass000.A00(258);
            }
            AnonymousClass0LU.A03(cls, message, e);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgStoryPrefetchServerFeaturesDownloadWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AnonymousClass0wJ.A1O(context, workerParameters);
        this.A05 = context;
    }
}
