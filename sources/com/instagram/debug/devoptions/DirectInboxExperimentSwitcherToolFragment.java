package com.instagram.debug.devoptions;

import X.AnonymousClass0MZ;
import X.AnonymousClass0wJ;
import X.AnonymousClass36P;
import X.AnonymousClass4MA;
import X.AnonymousClass4u2;
import X.C04220Ms;
import X.C04530Oa;
import X.C14030oh;
import X.C18230wP;
import X.C23411dm;
import X.C40877Lpc;
import X.C41026Luf;
import X.C62153Xk;
import X.C63273h9;
import X.C63613hu;
import X.C80644m9;
import X.C82034oy;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.instagram.debug.devoptions.DirectInboxDevUtil;
import com.instagram.debug.quickexperiment.storage.QuickExperimentDebugStore;
import com.instagram.debug.quickexperiment.storage.QuickExperimentDebugStoreManager;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.webrtc.PeerConnectionFactory;

public final class DirectInboxExperimentSwitcherToolFragment extends C23411dm implements C82034oy {
    public DirectInboxDevUtil directInboxDevUtil;
    public QuickExperimentDebugStore quickExperimentDebugStore;
    public final C04530Oa userSession$delegate = C80644m9.A00(this);

    public void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4u2.A08(r2, "Inbox Experiment Switcher");
    }

    public String getModuleName() {
        return "direct_inbox_experiment_switcher_tool";
    }

    public void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        refreshMenuItems();
    }

    private final UserSession getUserSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }

    /* access modifiers changed from: private */
    public final void setVariant(int i, boolean z) {
        DirectInboxDevUtil directInboxDevUtil2 = this.directInboxDevUtil;
        if (directInboxDevUtil2 == null) {
            C04220Ms.A0E("directInboxDevUtil");
            throw null;
        }
        directInboxDevUtil2.setInboxV2Variant(i);
        refreshMenuItems();
        if (z) {
            resetApp();
        }
    }

    /* access modifiers changed from: private */
    public final void showInboxV2VariantSelectorDialog() {
        DirectInboxDevUtil directInboxDevUtil2 = this.directInboxDevUtil;
        if (directInboxDevUtil2 != null) {
            Iterator it = directInboxDevUtil2.inboxV2VariantList.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                String humanName = ((InboxV2Variant) it.next()).getHumanName();
                DirectInboxDevUtil directInboxDevUtil3 = this.directInboxDevUtil;
                if (directInboxDevUtil3 != null) {
                    if (C04220Ms.A0I(humanName, directInboxDevUtil3.getCurrentlySelectedInboxV2VariantHumanName())) {
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
            AnonymousClass0MZ r3 = new AnonymousClass0MZ();
            r3.A00 = i;
            Context context = getContext();
            if (context != null) {
                C41026Luf luf = new C41026Luf(context);
                luf.A08("Select Inbox 2.0 Variant");
                C40877Lpc lpc = luf.A01;
                DirectInboxDevUtil directInboxDevUtil4 = this.directInboxDevUtil;
                if (directInboxDevUtil4 != null) {
                    List<InboxV2Variant> list = directInboxDevUtil4.inboxV2VariantList;
                    ArrayList A0w = AnonymousClass0wJ.A0w(list);
                    for (InboxV2Variant humanName2 : list) {
                        A0w.add(humanName2.getHumanName());
                    }
                    luf.A06(new DirectInboxExperimentSwitcherToolFragment$showInboxV2VariantSelectorDialog$1$2(r3), (CharSequence[]) A0w.toArray(new String[0]), i);
                    DirectInboxExperimentSwitcherToolFragment$showInboxV2VariantSelectorDialog$1$3 directInboxExperimentSwitcherToolFragment$showInboxV2VariantSelectorDialog$1$3 = DirectInboxExperimentSwitcherToolFragment$showInboxV2VariantSelectorDialog$1$3.INSTANCE;
                    lpc.A0E = "Cancel";
                    lpc.A02 = directInboxExperimentSwitcherToolFragment$showInboxV2VariantSelectorDialog$1$3;
                    luf.A04(new DirectInboxExperimentSwitcherToolFragment$showInboxV2VariantSelectorDialog$1$4(this, r3), "Select");
                    luf.A05(new DirectInboxExperimentSwitcherToolFragment$showInboxV2VariantSelectorDialog$1$5(this, r3), "Select & restart");
                    luf.A01();
                    return;
                }
            } else {
                return;
            }
        }
        C04220Ms.A0E("directInboxDevUtil");
        throw null;
    }

    private final List getMenuItems() {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        AnonymousClass4MA.A02(new DirectInboxExperimentSwitcherToolFragment$getMenuItems$1(this), "Click to remove client overrides", A0v);
        A0v.add(new AnonymousClass36P(new DirectInboxExperimentSwitcherToolFragment$getMenuItems$2(this)));
        A0v.add(new C63273h9(false));
        C63613hu.A01("Inbox 2.0", A0v);
        DirectInboxDevUtil directInboxDevUtil2 = this.directInboxDevUtil;
        if (directInboxDevUtil2 != null) {
            C23411dm.A03(new DirectInboxExperimentSwitcherToolFragment$getMenuItems$3(this), PeerConnectionFactory.TRIAL_ENABLED, "Turn off to disable", A0v, directInboxDevUtil2.isInboxV2Enabled());
            C62153Xk r1 = new C62153Xk((CharSequence) "Variant", (View.OnClickListener) new DirectInboxExperimentSwitcherToolFragment$getMenuItems$4(this));
            DirectInboxDevUtil directInboxDevUtil3 = this.directInboxDevUtil;
            if (directInboxDevUtil3 != null) {
                r1.A04 = directInboxDevUtil3.getCurrentlySelectedInboxV2VariantHumanName();
                r1.A08 = true;
                A0v.add(r1);
                DirectInboxDevUtil directInboxDevUtil4 = this.directInboxDevUtil;
                if (directInboxDevUtil4 != null) {
                    C23411dm.A03(new DirectInboxExperimentSwitcherToolFragment$getMenuItems$6(this), "Logging", "Turn off to disable", A0v, directInboxDevUtil4.isInboxV2LoggingEnabled());
                    DirectInboxDevUtil directInboxDevUtil5 = this.directInboxDevUtil;
                    if (directInboxDevUtil5 != null) {
                        C23411dm.A03(new DirectInboxExperimentSwitcherToolFragment$getMenuItems$7(this), "Dynamic text", "Turn off to disable", A0v, directInboxDevUtil5.isInboxV2DynamicTextEnabled());
                        DirectInboxDevUtil directInboxDevUtil6 = this.directInboxDevUtil;
                        if (directInboxDevUtil6 != null) {
                            C23411dm.A03(new DirectInboxExperimentSwitcherToolFragment$getMenuItems$8(this), "Close friends icon", "Turn off to disable", A0v, directInboxDevUtil6.isInboxV2CloseFriendsIconEnabled());
                            DirectInboxDevUtil directInboxDevUtil7 = this.directInboxDevUtil;
                            if (directInboxDevUtil7 != null) {
                                C23411dm.A03(new DirectInboxExperimentSwitcherToolFragment$getMenuItems$9(this), "Close friends icon", "Turn off to disable", A0v, directInboxDevUtil7.isInboxV2CloseFriendsIconEnabled());
                                DirectInboxDevUtil directInboxDevUtil8 = this.directInboxDevUtil;
                                if (directInboxDevUtil8 != null) {
                                    C23411dm.A03(new DirectInboxExperimentSwitcherToolFragment$getMenuItems$10(this), "Immersive Creation 1.0", "Turn off to disable", A0v, directInboxDevUtil8.isImmersiveCreationEnabled());
                                    DirectInboxDevUtil directInboxDevUtil9 = this.directInboxDevUtil;
                                    if (directInboxDevUtil9 != null) {
                                        C23411dm.A03(new DirectInboxExperimentSwitcherToolFragment$getMenuItems$11(this), "Immersive Creation 1.1", "Turn off to disable", A0v, directInboxDevUtil9.isFoundationalChangesEnabled());
                                        C63613hu.A01("Music Notes", A0v);
                                        DirectInboxDevUtil directInboxDevUtil10 = this.directInboxDevUtil;
                                        if (directInboxDevUtil10 != null) {
                                            C23411dm.A03(new DirectInboxExperimentSwitcherToolFragment$getMenuItems$12(this), PeerConnectionFactory.TRIAL_ENABLED, "Turn off to disable", A0v, directInboxDevUtil10.isMusicNotesEnabled());
                                            DirectInboxDevUtil directInboxDevUtil11 = this.directInboxDevUtil;
                                            if (directInboxDevUtil11 != null) {
                                                C23411dm.A03(new DirectInboxExperimentSwitcherToolFragment$getMenuItems$13(this), "Auto play enabled", "Turn off to disable", A0v, directInboxDevUtil11.isMusicNotesAutoPlayEnabled());
                                                return A0v;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        C04220Ms.A0E("directInboxDevUtil");
        throw null;
    }

    /* access modifiers changed from: private */
    public final void refreshMenuItems() {
        setItems(getMenuItems());
    }

    /* access modifiers changed from: private */
    public final void resetApp() {
        ComponentName component;
        Context context = getContext();
        if (context != null) {
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getApplicationContext().getPackageName());
            if (!(launchIntentForPackage == null || (component = launchIntentForPackage.getComponent()) == null)) {
                Intent makeRestartActivityTask = Intent.makeRestartActivityTask(component);
                C18230wP.A0O().A09(context.getApplicationContext(), makeRestartActivityTask);
            }
            Runtime.getRuntime().exit(0);
        }
    }

    public void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(-247773306);
        super.onCreate(bundle);
        this.quickExperimentDebugStore = QuickExperimentDebugStoreManager.getOverrideStore(AnonymousClass0wJ.A0X(this.userSession$delegate));
        DirectInboxDevUtil.Companion companion = DirectInboxDevUtil.Companion;
        UserSession A0X = AnonymousClass0wJ.A0X(this.userSession$delegate);
        QuickExperimentDebugStore quickExperimentDebugStore2 = this.quickExperimentDebugStore;
        if (quickExperimentDebugStore2 == null) {
            C04220Ms.A0E("quickExperimentDebugStore");
            throw null;
        }
        this.directInboxDevUtil = companion.getInstance(A0X, quickExperimentDebugStore2);
        C14030oh.A09(-1550242558, A02);
    }

    public UserSession getSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }
}
