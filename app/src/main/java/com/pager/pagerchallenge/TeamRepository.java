package com.pager.pagerchallenge;

import io.reactivex.Flowable;
import java.util.List;

public interface TeamRepository {

  Flowable<List<TeamService.TeamResponse>> get();
}
