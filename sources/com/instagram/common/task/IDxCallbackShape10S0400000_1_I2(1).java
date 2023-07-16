package com.instagram.common.task;

import X.AnonymousClass0MQ;
import X.AnonymousClass0wJ;
import X.BKH;
import X.C11630kW;
import X.C13330nS;
import X.C13950oZ;
import X.C171799zz;
import X.C18180wK;
import X.C18240wQ;
import X.C18250wR;
import X.C30809GWj;
import X.C63813iO;
import X.C63863iT;
import android.app.Dialog;
import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.reels.dashboard.fragment.ReelDashboardFragment;
import java.io.File;

public class IDxCallbackShape10S0400000_1_I2 extends C30809GWj {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public IDxCallbackShape10S0400000_1_I2(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A04 = i;
        this.A01 = obj;
        this.A02 = obj3;
        this.A03 = obj4;
        this.A00 = obj2;
    }

    public final void A02(Exception exc) {
        Context A0C;
        int i;
        int i2;
        String str;
        if (this.A04 != 0) {
            A0C = (Context) this.A01;
            i = 2131826851;
            i2 = 0;
            str = "SAVE_QR_CODE_error";
        } else {
            A0C = C18240wQ.A0C(this.A00);
            i = 2131836068;
            i2 = 0;
            str = "MediaSaver_something_went_wrong";
        }
        C63813iO.A03(A0C, str, i, i2);
    }

    public final /* bridge */ /* synthetic */ void A03(Object obj) {
        String str;
        if (this.A04 != 0) {
            boolean A1X = AnonymousClass0wJ.A1X(obj);
            Context context = (Context) this.A01;
            int i = 2131826851;
            if (A1X) {
                i = 2131835213;
            }
            if (A1X) {
                str = null;
            } else {
                str = "SAVE_QR_CODE result is null";
            }
            C63813iO.A03(context, str, i, 0);
            USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M((C13330nS) this.A02, "ig_qr_code_download"), 1411);
            if (AnonymousClass0wJ.A1U(A0I)) {
                A0I.A0T("color", "na");
                A0I.A0S("entity_id", Long.valueOf(((AnonymousClass0MQ) this.A03).A00));
                A0I.A0T("source", ((C11630kW) this.A00).getModuleName());
                A0I.Bb4();
                return;
            }
            return;
        }
        ReelDashboardFragment reelDashboardFragment = (ReelDashboardFragment) this.A00;
        Bundle A06 = C18180wK.A06();
        A06.putSerializable("ReelPollShareResultCameraFragment.ARGUMENTS_KEY_ENTRY_POINT", C171799zz.A2k);
        A06.putParcelable("ReelPollShareResultCameraFragment.ARGUMENTS_KEY_ENTRY_VIEW_BOUNDS", (RectF) this.A03);
        A06.putString("ReelPollShareResultCameraFragment.ARGUMENTS_KEY_MEDIA_ID", ((BKH) this.A02).A0U);
        A06.putString("ReelPollShareResultCameraFragment.ARGUMENTS_KEY_MEDIA_FILE_PATH", ((File) obj).getAbsolutePath());
        C63863iT.A06(reelDashboardFragment.getActivity(), A06, reelDashboardFragment.A0A, TransparentModalActivity.class, "reel_poll_share_result_camera").A0I(reelDashboardFragment.getContext());
    }

    public final void onFinish() {
        if (this.A04 != 0) {
            super.onFinish();
        } else {
            C18250wR.A1C(this.A01);
        }
    }

    public final void onStart() {
        if (this.A04 == 0) {
            C13950oZ.A00((Dialog) this.A01);
        }
    }
}
