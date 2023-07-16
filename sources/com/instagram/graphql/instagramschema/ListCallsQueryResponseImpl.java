package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18190wL;
import X.C18230wP;
import X.C28174Ezk;
import X.C61963Wn;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;

public final class ListCallsQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class ListIgCallsPaginatedQuery extends TreeJNI implements C81204nM {

        public final class IgCalls extends TreeJNI implements C81204nM {

            public final class Caller extends TreeJNI implements C81204nM {

                public final class ProfilePicture extends TreeJNI implements C81204nM {
                    public final String[] getScalarFields() {
                        return C18230wP.A1Z();
                    }
                }

                public final C108776iv[] getEdgeFields() {
                    return AnonymousClass0wJ.A1a(ProfilePicture.class, "profile_picture");
                }

                public final String[] getScalarFields() {
                    return new String[]{"instagram_user_id", FXPFAccessLibraryDebugFragment.NAME, C61963Wn.A00()};
                }
            }

            public final class CallEnded extends TreeJNI implements C81204nM {
                public final String[] getScalarFields() {
                    return new String[]{"call_ended_time_sec", "did_join", "did_others_join"};
                }
            }

            public final String[] getScalarFields() {
                return new String[]{"call_start_time_sec", C28174Ezk.A00(66), "ig_thread_id", C28174Ezk.A00(88), "is_drop_in", C28174Ezk.A00(612), C28174Ezk.A00(257), "thread_name", C28174Ezk.A00(11)};
            }

            public final class ThreadProfilePics extends TreeJNI implements C81204nM {
                public final String[] getScalarFields() {
                    return C18230wP.A1Z();
                }
            }

            public final C108776iv[] getEdgeFields() {
                return new C108776iv[]{C18190wL.A0G(ThreadProfilePics.class, "thread_profile_pics", true), C18190wL.A0G(Caller.class, "caller", false), C18190wL.A0G(CallEnded.class, C28174Ezk.A00(170), false)};
            }
        }

        public final String[] getScalarFields() {
            return new String[]{"cursor", "has_more"};
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1b(IgCalls.class, "ig_calls");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(ListIgCallsPaginatedQuery.class, "list_ig_calls_paginated_query(data:$data)");
    }
}
