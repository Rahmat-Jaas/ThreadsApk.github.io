package com.instagram.debug.devoptions.helper;

import X.AnonymousClass0i4;
import X.AnonymousClass0wJ;
import X.AnonymousClass4MA;
import X.AnonymousClass4MC;
import X.C04220Ms;
import X.C06750aI;
import X.C18180wK;
import X.C18200wM;
import X.C18230wP;
import X.C18250wR;
import X.C25786Drz;
import X.C34442Jo;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class DevOptionsHelper implements AnonymousClass0i4 {
    public static final Companion Companion = new Companion();
    public final Map _optionNameToMenuItems = AnonymousClass0wJ.A0y();
    public final Map _optionNameToSwitchItems = AnonymousClass0wJ.A0y();

    public final class Companion {
        public final AnonymousClass4MA addLongPressToPin(AnonymousClass4MA r2, UserSession userSession, OnPinnedDevOptionItemAdded onPinnedDevOptionItemAdded) {
            AnonymousClass0wJ.A1M(r2, 0, onPinnedDevOptionItemAdded);
            if (!C34442Jo.A00()) {
                r2.A04 = new DevOptionsHelper$Companion$addLongPressToPin$1$1(r2, onPinnedDevOptionItemAdded);
            }
            return r2;
        }

        public final DevOptionsHelper getInstance(UserSession userSession) {
            C04220Ms.A0B(userSession, 0);
            return (DevOptionsHelper) userSession.A01(DevOptionsHelper.class, DevOptionsHelper$Companion$getInstance$1.INSTANCE);
        }

        public final void removePinnedItemInPrefs(String str) {
            C04220Ms.A0B(str, 0);
            SharedPreferences A0C = C18200wM.A0C();
            List convertToArray = convertToArray(C18200wM.A0h(A0C, "rageshake_pinned_items_as_json"));
            convertToArray.remove(str);
            C18180wK.A0v(A0C.edit(), "rageshake_pinned_items_as_json", C18200wM.A0l(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, convertToArray));
        }

        private final List convertToArray(String str) {
            if (str == null) {
                return AnonymousClass0wJ.A0v();
            }
            String[] strArr = (String[]) C18250wR.A0h(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1).A02(str, 0).toArray(new String[0]);
            return C06750aI.A18(Arrays.copyOf(strArr, strArr.length));
        }

        private final String convertToString(List list) {
            return C18200wM.A0l(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, list);
        }

        private final void launchFragment(UserSession userSession, Activity activity, Fragment fragment, boolean z) {
            C04220Ms.A0C(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            C25786Drz A0Q = C18180wK.A0Q((FragmentActivity) activity, userSession);
            A0Q.A03 = fragment;
            if (z) {
                A0Q.A08();
            }
            A0Q.A05();
        }

        public static /* synthetic */ void launchFragment$default(Companion companion, UserSession userSession, Activity activity, Fragment fragment, boolean z, int i, Object obj) {
            if ((i & 8) != 0) {
                z = false;
            }
            companion.launchFragment(userSession, activity, fragment, z);
        }

        /* access modifiers changed from: private */
        public final boolean isPinnedItem(String str) {
            return convertToArray(C18200wM.A0h(C18200wM.A0C(), "rageshake_pinned_items_as_json")).contains(str);
        }

        /* access modifiers changed from: private */
        public final void storePinnedItemInPrefs(String str) {
            SharedPreferences A0C = C18200wM.A0C();
            List convertToArray = convertToArray(C18200wM.A0h(A0C, "rageshake_pinned_items_as_json"));
            convertToArray.add(str);
            C18180wK.A0v(A0C.edit(), "rageshake_pinned_items_as_json", C18200wM.A0l(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, convertToArray));
        }

        public final void addMenuItem(UserSession userSession, List list, AnonymousClass4MA r3, OnPinnedDevOptionItemAdded onPinnedDevOptionItemAdded) {
            AnonymousClass0wJ.A1N(userSession, list);
            AnonymousClass0wJ.A1Q(r3, onPinnedDevOptionItemAdded);
            addLongPressToPin(r3, userSession, onPinnedDevOptionItemAdded);
            list.add(r3);
        }

        public final void addSwitchItem(UserSession userSession, List list, AnonymousClass4MC r3, OnPinnedDevOptionItemAdded onPinnedDevOptionItemAdded) {
            AnonymousClass0wJ.A1N(userSession, list);
            AnonymousClass0wJ.A1Q(r3, onPinnedDevOptionItemAdded);
            addLongPressToPin(r3, userSession, onPinnedDevOptionItemAdded);
            list.add(r3);
        }

        public final List getPinnedItems() {
            return convertToArray(C18200wM.A0h(C18200wM.A0C(), "rageshake_pinned_items_as_json"));
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }

        public final AnonymousClass4MC addLongPressToPin(AnonymousClass4MC r2, UserSession userSession, OnPinnedDevOptionItemAdded onPinnedDevOptionItemAdded) {
            AnonymousClass0wJ.A1M(r2, 0, onPinnedDevOptionItemAdded);
            if (!C34442Jo.A00()) {
                r2.A07 = new DevOptionsHelper$Companion$addLongPressToPin$2$1(r2, onPinnedDevOptionItemAdded);
            }
            return r2;
        }

        public final void launchFragment(UserSession userSession, Activity activity, String str) {
            boolean A1Y = AnonymousClass0wJ.A1Y(userSession, activity);
            try {
                Object A0g = C18230wP.A0g(str);
                C04220Ms.A0C(A0g, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
                launchFragment(userSession, activity, (Fragment) A0g, A1Y);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public interface OnPinnedDevOptionItemAdded {
        void onMenuItemAdded();
    }

    public static final void addMenuItem(UserSession userSession, List list, AnonymousClass4MA r3, OnPinnedDevOptionItemAdded onPinnedDevOptionItemAdded) {
        Companion.addMenuItem(userSession, list, r3, onPinnedDevOptionItemAdded);
    }

    public static final void addSwitchItem(UserSession userSession, List list, AnonymousClass4MC r3, OnPinnedDevOptionItemAdded onPinnedDevOptionItemAdded) {
        Companion.addSwitchItem(userSession, list, r3, onPinnedDevOptionItemAdded);
    }

    public static final DevOptionsHelper getInstance(UserSession userSession) {
        return Companion.getInstance(userSession);
    }

    public static final List getPinnedItems() {
        return Companion.getPinnedItems();
    }

    public static final void launchFragment(UserSession userSession, Activity activity, String str) {
        Companion.launchFragment(userSession, activity, str);
    }

    public static final void removePinnedItemInPrefs(String str) {
        Companion.removePinnedItemInPrefs(str);
    }

    public final Map getMenuItemMap() {
        return this._optionNameToMenuItems;
    }

    public final Map getSwitchItemMap() {
        return this._optionNameToSwitchItems;
    }

    public void onSessionWillEnd() {
        this._optionNameToMenuItems.clear();
    }

    public final void storeItems(Context context, List list) {
        AnonymousClass0wJ.A1N(context, list);
        List list2 = null;
        if (this._optionNameToMenuItems.isEmpty()) {
            list2 = list;
        }
        if (list2 != null) {
            ArrayList A0v = AnonymousClass0wJ.A0v();
            for (Object next : list2) {
                if (next instanceof AnonymousClass4MA) {
                    AnonymousClass4MA r1 = (AnonymousClass4MA) next;
                    CharSequence charSequence = r1.A05;
                    if (charSequence == null) {
                        charSequence = context.getString(r1.A02);
                    }
                    String charSequence2 = charSequence.toString();
                    C04220Ms.A06(charSequence2);
                    if (charSequence2.length() > 0) {
                        A0v.add(next);
                    }
                }
            }
            ArrayList<AnonymousClass4MA> A0x = AnonymousClass0wJ.A0x(A0v, 10);
            for (Object next2 : A0v) {
                C04220Ms.A0C(next2, "null cannot be cast to non-null type com.instagram.ui.menu.MenuItem");
                A0x.add(next2);
            }
            for (AnonymousClass4MA r2 : A0x) {
                Map map = this._optionNameToMenuItems;
                CharSequence charSequence3 = r2.A05;
                if (charSequence3 == null) {
                    charSequence3 = context.getString(r2.A02);
                }
                String charSequence4 = charSequence3.toString();
                C04220Ms.A06(charSequence4);
                map.put(charSequence4, r2);
            }
        }
        if (this._optionNameToSwitchItems.isEmpty()) {
            ArrayList A0v2 = AnonymousClass0wJ.A0v();
            for (Object next3 : list) {
                if (next3 instanceof AnonymousClass4MC) {
                    AnonymousClass4MC r12 = (AnonymousClass4MC) next3;
                    CharSequence charSequence5 = r12.A0B;
                    if (charSequence5 == null) {
                        charSequence5 = context.getString(r12.A04);
                    }
                    String charSequence6 = charSequence5.toString();
                    C04220Ms.A06(charSequence6);
                    if (charSequence6.length() > 0) {
                        A0v2.add(next3);
                    }
                }
            }
            ArrayList<AnonymousClass4MC> A0x2 = AnonymousClass0wJ.A0x(A0v2, 10);
            for (Object next4 : A0v2) {
                C04220Ms.A0C(next4, "null cannot be cast to non-null type com.instagram.ui.menu.SwitchItem");
                A0x2.add(next4);
            }
            for (AnonymousClass4MC r22 : A0x2) {
                Map map2 = this._optionNameToSwitchItems;
                CharSequence charSequence7 = r22.A0B;
                if (charSequence7 == null) {
                    charSequence7 = context.getString(r22.A04);
                }
                String charSequence8 = charSequence7.toString();
                C04220Ms.A06(charSequence8);
                map2.put(charSequence8, r22);
            }
        }
    }
}
