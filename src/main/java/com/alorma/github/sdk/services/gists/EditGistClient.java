package com.alorma.github.sdk.services.gists;

import android.content.Context;

import com.alorma.github.sdk.bean.dto.request.EditGistRequestDTO;
import com.alorma.github.sdk.bean.dto.response.Gist;
import com.alorma.github.sdk.services.client.GithubClient;

import retrofit.RestAdapter;
import rx.Observable;

public class EditGistClient extends GithubClient<Gist> {

    private String id;
    private EditGistRequestDTO editGistRequestDTO;

    public EditGistClient(Context context, String id, EditGistRequestDTO editGistRequestDTO) {
        super(context);
        this.id = id;
        this.editGistRequestDTO = editGistRequestDTO;
    }

    @Override
    protected Observable<Gist> getApiObservable(RestAdapter restAdapter) {
        return restAdapter.create(GistsService.class).edit(id, editGistRequestDTO);
    }
}
