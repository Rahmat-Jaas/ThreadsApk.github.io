package com.instagram.common.api.base;

import X.AnonymousClass00U;
import X.AnonymousClass0TJ;
import X.AnonymousClass0wJ;
import X.AnonymousClass3XX;
import X.AnonymousClass5z0;
import X.AnonymousClass6CK;
import X.BKU;
import X.C04220Ms;
import X.C10450iM;
import X.C1366783w;
import X.C13950oZ;
import X.C14030oh;
import X.C146138lh;
import X.C18180wK;
import X.C308923j;
import X.C63803iN;
import X.C63813iO;
import X.C63873iU;
import X.C85184ue;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.instagram.bugreporter.BugReport;
import com.instagram.bugreporter.BugReportComposerViewModel;
import com.instagram.bugreporter.BugReporterService;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.Iterator;

public class IDxACallbackShape0S0500000_1_I2 extends C63873iU {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    public IDxACallbackShape0S0500000_1_I2(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.A05 = i;
        this.A00 = obj4;
        this.A02 = obj;
        this.A03 = obj5;
        this.A01 = obj2;
        this.A04 = obj3;
    }

    public final void onFail(AnonymousClass3XX r8) {
        int A032;
        int i;
        String str;
        if (this.A05 != 0) {
            A032 = C14030oh.A03(118542299);
            if (AnonymousClass0wJ.A1W(r8.A00)) {
                Throwable th = r8.A01;
                if (th == null) {
                    str = "OptionalResponse.error is null";
                } else if (!(th instanceof AnonymousClass6CK)) {
                    str = "OptionalResponse.error is not a GraphQLException";
                } else {
                    ImmutableList immutableList = ((AnonymousClass6CK) th).A00;
                    if (immutableList.isEmpty()) {
                        str = "OptionalResponse.error.errors is empty";
                    } else {
                        C1366783w it = immutableList.iterator();
                        str = null;
                        while (it.hasNext()) {
                            C146138lh r2 = (C146138lh) it.next();
                            if (r2.getDescription() != null) {
                                if (str == null) {
                                    str = r2.getDescription();
                                } else {
                                    str = AnonymousClass00U.A0V(str, " | ", r2.getDescription());
                                }
                            }
                        }
                        if (str != null) {
                            C10450iM.A04("BugReporterService", AnonymousClass00U.A0L("Error creating flytrap bug from graphQL, response present: ", str), 1);
                        } else {
                            str = "IGraphQLError.description is unavailable.";
                        }
                    }
                }
            } else {
                str = "OptionalResponse unavailable. Device is likely offline";
            }
            UserSession userSession = (UserSession) this.A03;
            BugReport bugReport = (BugReport) this.A01;
            BugReporterService.A02((Context) this.A02, bugReport, (BugReportComposerViewModel) this.A04, userSession, true);
            BugReporterService.A05(userSession, str, bugReport.A0D);
            i = 354781922;
        } else {
            A032 = C14030oh.A03(-1318980838);
            C63813iO.A03((Context) this.A01, "hide_post_failed", 2131828326, 0);
            i = -74381202;
        }
        C14030oh.A0A(i, A032);
    }

    public final void onFinish() {
        Boolean bool;
        if (this.A05 != 0) {
            super.onFinish();
            return;
        }
        int A032 = C14030oh.A03(1808432863);
        Dialog dialog = (Dialog) this.A04;
        Activity ownerActivity = dialog.getOwnerActivity();
        if (ownerActivity != null) {
            bool = Boolean.valueOf(ownerActivity.isDestroyed());
        } else {
            bool = null;
        }
        if (C04220Ms.A0I(bool, C18180wK.A0X())) {
            dialog.dismiss();
        }
        C14030oh.A0A(1403478635, A032);
    }

    public final void onStart() {
        if (this.A05 != 0) {
            super.onStart();
            return;
        }
        int A032 = C14030oh.A03(-1074129601);
        C13950oZ.A00((Dialog) this.A04);
        C14030oh.A0A(-1071931733, A032);
    }

    public final void onSuccess(Object obj) {
        int i;
        int i2;
        int i3;
        String str;
        if (this.A05 != 0) {
            i = C14030oh.A03(-1503299537);
            int A032 = C14030oh.A03(-1199683583);
            Object obj2 = ((AnonymousClass5z0) obj).A01;
            if (obj2 != null) {
                C85184ue r1 = (C85184ue) obj2;
                if (!(r1.Ann() == null || r1.Ann().AUX() == null)) {
                    String AUX = r1.Ann().AUX();
                    Context context = (Context) this.A02;
                    UserSession userSession = (UserSession) this.A03;
                    BugReporterService.A04(context, userSession);
                    BugReport bugReport = (BugReport) this.A01;
                    BugReporterService.A06(userSession, AUX, bugReport.A0D);
                    Iterator it = bugReport.A0B.iterator();
                    while (it.hasNext()) {
                        BugReporterService.A03(context, bugReport, userSession, AUX, C18180wK.A0k(it));
                    }
                    Iterator it2 = bugReport.A0A.iterator();
                    while (it2.hasNext()) {
                        BugReporterService.A03(context, bugReport, userSession, AUX, C18180wK.A0k(it2));
                    }
                    i3 = 728619608;
                    C14030oh.A0A(i3, A032);
                    i2 = 1533887799;
                }
            }
            Context context2 = (Context) this.A02;
            UserSession userSession2 = (UserSession) this.A03;
            BugReport bugReport2 = (BugReport) this.A01;
            BugReportComposerViewModel bugReportComposerViewModel = (BugReportComposerViewModel) this.A04;
            if (obj2 == null) {
                str = "Error: IGBugReportSubmitMutationResponse.IGGraphQLResult is null";
            } else {
                C85184ue r2 = (C85184ue) obj2;
                if (r2.Ann() == null) {
                    str = "Error: IGBugReportSubmitMutationResponse.IGGraphQLResult.IgBugSubmit is null";
                } else if (r2.Ann().AUX() == null) {
                    str = "Error: IGBugReportSubmitMutationResponse.IGGraphQLResult.IgBugSubmit.BugId is null";
                } else {
                    str = "";
                }
            }
            C10450iM.A04("BugReporterService", str, 1);
            BugReporterService.A02(context2, bugReport2, bugReportComposerViewModel, userSession2, !C63803iN.A0E(AnonymousClass0TJ.A05, userSession2, 36326236389123552L));
            BugReporterService.A05(userSession2, str, bugReport2.A0D);
            i3 = 585403326;
            C14030oh.A0A(i3, A032);
            i2 = 1533887799;
        } else {
            i = C14030oh.A03(1617031405);
            BKU bku = (BKU) this.A03;
            bku.A0f.A57 = ((C308923j) this.A02).A00;
            UserSession userSession3 = (UserSession) this.A00;
            bku.AAy(userSession3);
            User A2Z = bku.A2Z(userSession3);
            if (A2Z == null) {
                i2 = 1244171694;
            } else {
                A2Z.A1Z();
                A2Z.A1t(userSession3);
                i2 = -972878707;
            }
        }
        C14030oh.A0A(i2, i);
    }
}
