package com.clubos.codechallenge.repository;

import com.clubos.codechallenge.model.MemberCheckin;
import com.clubos.codechallenge.model.ResponseData;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import okhttp3.OkHttpClient;

public class MemberCheckinsRepository {

  private final OkHttpClient client;
  private final JsonAdapter<ResponseData<MemberCheckin>> memberCheckinAdapter;

  public MemberCheckinsRepository(final OkHttpClient client, final Moshi moshi) {
    this.client = client;
    this.memberCheckinAdapter = moshi.adapter(Types.newParameterizedType(ResponseData.class, MemberCheckin.class));
  }

  // TODO: Implement API call and return data
  public List<MemberCheckin> fetchAllByLocationId(final int locationId) throws IOException {
    return Collections.emptyList();
  }
}
