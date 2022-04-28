https://dog.ceo/api/breeds/image/random

if __name__ == '__main__':
    url = 'https://dog.ceo/api/breeds/image/random'
    response = requests.get(url)
   
    print(response)
    
    if response.status_code == 200:
        print(response.content)
        
f = open("tareaapi.txt", "w")
f.write(response.text)
f.close()