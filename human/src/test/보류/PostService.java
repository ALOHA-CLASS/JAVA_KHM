package test.보류;

import java.util.List;

public interface PostService<T> {
	
	// 글 목록
	public List<T> list(T t) throws Exception;
	
	// 글 조회
	public T select(T t) throws Exception;
	
	// 글 등록
	public boolean insert(T t) throws Exception;
	
	// 글 수정
	public boolean update(T t) throws Exception;
	
	// 글 삭제
	public boolean delete(T t) throws Exception;
	

}
