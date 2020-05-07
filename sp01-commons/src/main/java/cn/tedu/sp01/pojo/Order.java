package cn.tedu.sp01.pojo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
	private String id; //uyt-938y4r9238y-4r23-872
	private User user; //�����������û�
	private List<Item> items; //�����е���Ʒ�б�
}