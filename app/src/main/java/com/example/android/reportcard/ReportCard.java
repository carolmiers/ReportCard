package com.example.android.reportcard;

import static android.R.attr.width;

/**
 * Created by Carol on 14/05/2017.
 */

public class ReportCard {
    private String mSubjectaken;
    private String mScoreresult;

public ReportCard(String subjectaken,String subjectscore){
    mSubjectaken = subjectaken;
    mScoreresult = subjectscore;  }

public String getmsubjectaken()
    {return mSubjectaken;}

public String getmscoreresult()
    {return mScoreresult;}

public String toString() {
    return "Results are: for " + mSubjectaken + " you scored  " +
                mScoreresult +"%";
    } }