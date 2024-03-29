package model;

public class Skill {
	
	private int SkillId;
	private String SkillName;
	private String SkillDescription;
	private String Active;
	
	public Skill() {
		super();
	}

	public Skill(int skillId, String skillName, String skillDescription) {
		super();
		SkillId = skillId;
		SkillName = skillName;
		SkillDescription = skillDescription;
	}

	public int getSkillId() {
		return SkillId;
	}

	public void setSkillId(int skillId) {
		SkillId = skillId;
	}

	public String getSkillName() {
		return SkillName;
	}

	public void setSkillName(String skillName) {
		SkillName = skillName;
	}

	public String getSkillDescription() {
		return SkillDescription;
	}

	public void setSkillDescription(String skillDescription) {
		SkillDescription = skillDescription;
	}

	public String getActive() {
		return Active;
	}

	public void setActive(String active) {
		Active = active;
	}

	@Override
	public String toString() {
		return "Skill [SkillId=" + SkillId + ", SkillName=" + SkillName + ", SkillDescription=" + SkillDescription
				+ ", Active=" + Active + "]";
	}
	
	

}
